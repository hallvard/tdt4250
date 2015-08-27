package no.hal.pg.runtime.engine;

import java.util.ArrayList;
import java.util.Collection;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;

@Component(immediate=true)
public class EngineFactory implements IEngineFactory {

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

	public IEngine createEngine() {
		return new Engine(taskProviders.toArray(new ITaskProvider[taskProviders.size()]));
	}
}
