/**
 */
package no.hal.sokoban.model.tests;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import no.hal.sokoban.model.SokobanGrid;
import no.hal.sokoban.model.SokobanLevel;
import no.hal.sokoban.model.UoD;
import no.hal.sokoban.model.util.ModelResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sokoban Grid</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelResourceTest extends TestCase {

	private Collection<SokobanLevel> testLoadResource(String name, int levelCount, String levelNameFormat) {
		InputStream input = getClass().getResourceAsStream(name);
		Resource.Factory resourceFactory = new ModelResourceFactoryImpl();
		Resource resource = resourceFactory.createResource(URI.createURI(name));
		try {
			resource.load(input, null);
			assertEquals(1, resource.getContents().size());
			EObject root = resource.getContents().get(0);
			Collection<SokobanLevel> levels = null;
			if (root instanceof UoD) {
				levels = ((UoD) root).getLevels();
			} else if (root instanceof SokobanLevel) {
				levels = Collections.singletonList((SokobanLevel) root);
			} else {
				fail();
			}
			assertEquals(levelCount, levels.size());
			int count = 0;
			for (SokobanLevel level : levels) {
				String levelName = (levelNameFormat != null ? String.format(levelNameFormat, (count + 1)) : null);
				if (levelName != null) {
					assertEquals(levelName, level.getProperties().get("name"));
				}
				count++;
			}
			return levels;
		} catch (IOException e) {
			System.err.println(resource.getErrors());
		}
		return null;
	}
	
	private void testCreateGrid(SokobanLevel level) {
		SokobanGrid grid = level.createGrid();
		assertTrue(grid.getPlayerX() >= 0);
		assertTrue(grid.getPlayerY() >= 0);
	}
	private void testCreateGrid(Iterable<SokobanLevel> levels) {
		for (SokobanLevel level : levels) {
			testCreateGrid(level);
		}
	}
	
	public void testSample1() {
		Collection<SokobanLevel> levels = testLoadResource("sample1.sok", 1, null);
		testCreateGrid(levels);
	}

	public void testPicocosmos() {
		Collection<SokobanLevel> levels = testLoadResource("picocosmos.sok", 20, "PICOKOSMOS %02d");
		testCreateGrid(levels);
	}

	public void testMicrocosmos() {
		Collection<SokobanLevel> levels = testLoadResource("microcosmos.sok", 40, "MICROCOSMOS %02d");
		testCreateGrid(levels);
	}
	
	public static void main(String[] args) {
		TestRunner.run(ModelResourceTest.class);
	}

}
