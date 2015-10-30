package no.hal.pg.runtime.engine;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Dictionary;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.cm.ManagedService;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.log.LogService;

import no.hal.pg.model.GameDef;
import no.hal.pg.model.Group;
import no.hal.pg.model.Person;
import no.hal.pg.model.TaskDef;
import no.hal.pg.runtime.Game;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.RuntimeFactory;
import no.hal.pg.runtime.RuntimePackage;
import no.hal.pg.runtime.Task;

@Component(factory=Engine.FACTORY_ID)
public class Engine implements IEngine, ManagedService {

	public final static String FACTORY_ID = "no.hal.pg.runtime.engine.Engine";

	@Activate
	public void activate(ComponentContext context) throws Exception {
		configure(context.getProperties());
	}
	
	private String key = String.valueOf(hashCode());
	
	@Override
	public String getKey() {
		return key;
	}

	protected boolean configure(Dictionary<String, ?> properties) {
		try {
			Object key = properties.get("IEngine.key");
			if (key != null) {
				this.key = String.valueOf(key);
			}
			return true;
		} catch (Exception e) {
			return false;
		}		
	}

	@Override
	public void updated(Dictionary<String, ?> properties) throws ConfigurationException {
		configure(properties);
	}

	@Deactivate
	public void deactivate(ComponentContext context) throws Exception {
		key = null;
	}

	//

	private Collection<ITaskProvider> taskProviders = new ArrayList<ITaskProvider>();

	@Reference(
			cardinality=ReferenceCardinality.MULTIPLE,
			policy=ReferencePolicy.DYNAMIC,
			unbind="removeTaskProvider"
	)
	public synchronized void addTaskProvider(ITaskProvider taskProvider) {
		taskProviders.add(taskProvider);
	}
	
	public synchronized void removeTaskProvider(ITaskProvider taskProvider) {
		taskProviders.remove(taskProvider);
	}
	
	//

	private IServiceExecutor serviceExecutor;
	
	@Reference(
			cardinality=ReferenceCardinality.MANDATORY,
			policy=ReferencePolicy.DYNAMIC
			)
	public synchronized void setServiceExecutor(IServiceExecutor serviceExecutor) {
		this.serviceExecutor = serviceExecutor;
	}
	public synchronized void unsetServiceExecutor(IServiceExecutor serviceExecutor) {
		this.serviceExecutor = null;
	}

	@Override
	public IServiceExecutor getServiceExecutor() {
		return serviceExecutor;
	}

	//

	private LogService logger = null;
	
	@Reference(
			cardinality=ReferenceCardinality.OPTIONAL,
			policy=ReferencePolicy.DYNAMIC,
			unbind="unsetLogService"
			)
	public synchronized void setLogService(LogService logService) {
		this.logger = logService;
	}
	public synchronized void unsetLogService(LogService logService) {
		this.logger = null;
	}

	//

	private Game game;
	
	@Override
	public void init(GameDef gameDef) {
		Game game = RuntimeFactory.eINSTANCE.createGame();
		for (Group group : gameDef.getParticipants()) {
			for (Person person : group.getPersons()) {
				Player player = RuntimeFactory.eINSTANCE.createPlayer();
				player.setPerson(person);
				game.getPlayers().add(player);
			}
		}
		for (TaskDef taskDef : gameDef.getAllTasks()) {
			int taskCount = 0;
			for (ITaskProvider taskProvider : taskProviders) {
				Task<?, ?> task = taskProvider.getTask(taskDef);
				if (task != null) {
					taskCount++;
					game.getTasks().add(task);
				}
			}
			if (taskCount == 0 && this.logger != null) {
				this.logger.log(LogService.LOG_WARNING, "No task found for " + taskDef);
			}
		}
		setGame(game);
		Resource gameDefResource = gameDef.eResource();
		URI gameUri = gameDefResource.getURI().trimFileExtension().appendFileExtension("pg-rt");
		ResourceSet resourceSet = gameDefResource.getResourceSet();
		if (resourceSet == null) {
			resourceSet = new ResourceSetImpl();
			resourceSet.getResources().add(gameDefResource);
		}
		Resource resource = resourceSet.createResource(gameUri);
		resource.getContents().add(game);
	}

	private void setGame(Game game) {
		this.game = game;
	}
	
	@Override
	public void init(Game game) {
		setGame(game);
	}

	@Override
	public Game getGame() {
		return game;
	}

	private boolean isChangeStateNotification(Notification notification) {
		return notification.getFeature() == RuntimePackage.eINSTANCE.getTask_CurrentState();
	}

	private Adapter stateListener = new AdapterImpl() {
		@Override
		public void notifyChanged(Notification msg) {
			if (msg.getNotifier() instanceof Task<?, ?>  && isChangeStateNotification(msg)) {
				taskStateChanged((Task<?, ?>) msg.getNotifier());
			}
		}
	};
	
	protected void taskStateChanged(Task<?, ?> task) {
		if (task.isFinished()) {
			taskFinished(task);
			startNextTask();
		}
	}

	protected void taskFinished(Task<?, ?> task) {
		task.eAdapters().remove(stateListener);
	}

	private int startCount = -1;
	
	protected void startNextTask() {
		int count = startCount;
		for (Task<?, ?> task : game.getTasks()) {
			if (count-- == 0) {
				break;
			}
			if (! task.isStarted()) {
				taskStarting(task);
				task.start();
			}
		}
	}

	protected void taskStarting(Task<?, ?> task) {
		task.eAdapters().add(stateListener);
	}

	@Override
	public void start() {
		startNextTask();
	}
}
