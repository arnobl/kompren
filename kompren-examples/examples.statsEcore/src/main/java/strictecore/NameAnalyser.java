package strictecore;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.json.JSONArray;
import org.json.JSONObject;

public class NameAnalyser {
	public static final String FILENAME = "names.json";
	
	public static void main(String[] args) {
		EcoreFactory.eINSTANCE.eClass();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		
		NameAnalyser na = new NameAnalyser(); 
//		na.extractNames(Main.getAllFiles());
		na.loadNames().ifPresent(json -> na.testName(json));
	}
	

	public void extractNames(List<Path> mmPaths) {
		final JSONObject root = new JSONObject();

		mmPaths.parallelStream().forEach(path -> {
			JSONArray names = getNames(path);	
			synchronized(root) {
//				root.append("mm", new JSONObject().put("path", path.toString()).put("names", names));
				root.append(path.toString(), names);
			}
		});
		
		try(FileWriter fw = new FileWriter(FILENAME)) {
			fw.append(JsonFormatter.format(root));
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public JSONArray getNames(Path path) {
		Set<String> names = new HashSet<>();
		
		ResourceSet rs = new ResourceSetImpl();
		Resource res = rs.getResource(URI.createURI(path.toString()), true);
		
		res.getAllContents().forEachRemaining(elt -> {
			if(elt instanceof EClassifier)
				names.add(((EClassifier)elt).getName());
		});
		
		Main.flushResourceSet(rs);
		return new JSONArray(names.toArray());
	}


	public Optional<JSONObject> loadNames() {
		try {
			return Optional.of(new JSONObject(Files.lines(Paths.get(FILENAME)).collect(Collectors.joining("\n"))));
		}catch(IOException e) {
			e.printStackTrace();
		}
		return Optional.empty();
	}
	
	
	private void testName(JSONObject names) {
		String mm = names.keys().next();
		JSONArray array = (JSONArray)((JSONArray)names.get(mm)).get(0);
		String name = (String)array.get(0);
		System.out.println(name);
	}
}



