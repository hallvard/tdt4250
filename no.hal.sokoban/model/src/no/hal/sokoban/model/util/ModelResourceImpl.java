/**
 */
package no.hal.sokoban.model.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

import no.hal.sokoban.model.ModelFactory;
import no.hal.sokoban.model.SokobanLevel;
import no.hal.sokoban.model.UoD;
import no.hal.sokoban.util.Direction;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see no.hal.sokoban.model.util.ModelResourceFactoryImpl
 * @generated NOT
 */
public class ModelResourceImpl extends ResourceImpl {
	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated
	 */
	public ModelResourceImpl(URI uri) {
		super(uri);
	}

	@Override
	public void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		UoD uod = ModelFactory.eINSTANCE.createUoD();
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		while (true) {
			try {
				SokobanLevel level = readLevel(reader);
				if (level == null) {
					break;
				}
				uod.getLevels().add(level);
			} catch (Exception e) {
				break;
			}
		}
		getContents().add(uod);
	}
	
	@Override
	public void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
		for (EObject root : getContents()) {
			if (root instanceof UoD) {
				for (SokobanLevel level : ((UoD) root).getLevels()) {
					writeLevel(level, outputStream);
				}
			}
		}
	}
	
	//
	

	private static String legalChars = "-_# .@+$*";

	protected boolean isLevelLine(String line, float factor, boolean allowSeparator) {
		int count = 0, otherCount = 0;
		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i);
			if (legalChars.indexOf(c) >= 0) {
				count++;
			} else if (Character.isDigit(c) || (allowSeparator && c == '|')) {
				otherCount++;
			}
		}
		return count > 0 && (count + otherCount >= line.length() * factor);
	}

	protected boolean isMovesLine(String line, float factor) {
		int count = 0, otherCount = 0;
		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i);
			if (Direction.valueOf(c) != null) {
				count++;
			} else if (Character.isDigit(c)) {
				otherCount++;
			}
		}
		return count > 0 && (count + otherCount >= line.length() * factor);
	}
	
	public SokobanLevel readLevel(BufferedReader reader) throws IOException {
		SokobanLevel level = ModelFactory.eINSTANCE.createSokobanLevel();
		String line = null;
		// we allow a sequence of invalid lines (e.g. natural language),
		// followed by a sequence of valid lines
		while ((line = reader.readLine()) != null) {
			// if line contains : it is meta data
			int pos = line.indexOf(':');
			if (pos > 0 && pos < line.length() - 1) {
				if (line.startsWith(";")) {
					line = line.substring(1);
					pos--;
				}
				level.getProperties().put(line.substring(0, pos), line.substring(pos + 1));
			} else if (line.trim().length() == 0) {
				if (! level.getLines().isEmpty()) {
					break;
				}
			} else if (isLevelLine(line, 1.0f, false)) {
				level.getLines().add(line);
			} else if (isMovesLine(line, 1.0f)) {
//				level.addMoves(line);
			} else if (! level.getProperties().containsKey("name")) {
				String name = null;
				if (line.startsWith(";")) {
					name = line.substring(1);
				} else if (line.startsWith("'") && line.endsWith("'")) {
					name = line.substring(1, line.length() - 1);
				}
				if (name != null) {
					level.getProperties().put("name", name.trim());
				}
			}
		}
		return level.getLines().isEmpty() ? null : level;
	}

	protected void writeLevel(SokobanLevel level, OutputStream output) throws IOException {
		OutputStreamWriter writer = new OutputStreamWriter(output);
		try {
			for (Map.Entry<String, String> entry : level.getProperties().entrySet()) {
				writer.write(entry.getKey());
				writer.write(':');
				writer.write(entry.getValue());
				writer.write('\n');
			}
			for (String line : level.getLines()) {
				writer.write(line);
				writer.write('\n');
			}
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
			}
		}
	}
	
} //ModelResourceImpl
