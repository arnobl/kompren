package strictecore;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import com.google.common.io.Files;

public class MatrixMatchAnalysis {

	public static void main(String[] args) {
		try {
			List<String> lines = Files.readLines(new File("stats/resultsMatch.txt"), Charset.defaultCharset());
			List<String[]> matrix = lines.stream().map(line -> line.split(";")).collect(Collectors.toList());
			Set<String> names = new HashSet<>();
			Map<String, Set<String>> clones = new HashMap<>();
			
			matrix.remove(matrix.size()-1); // The last line is truncated.
			
			int cptTypes=0;
			int cptOK = 0;
			
			for(int x=1, size=matrix.size(); x<size; x++) {
				String[] row = matrix.get(x);
				if("tk".equals(row[x])) {
					cptOK++;
					for(int y=1; y<size; y++) {
						if(x!=y && "tk".equals(row[y])) {
							if("tk".equals(matrix.get(y)[x])) {
								names.add(row[0]);
								names.add(matrix.get(0)[y]);
								Set<String> set = clones.get(row[0]);
								
								if(set==null) {
									set = clones.get(matrix.get(0)[y]);
									clones.put(row[0], set);
								} else {
									if(clones.get(matrix.get(0)[y])==null)
										clones.put(matrix.get(0)[y], set);
								}
								
								if(set==null) {
									set = new HashSet<>();
									clones.put(row[0], set);
									clones.put(matrix.get(0)[y], set);
								}

								set.add(row[0]);
								set.add(matrix.get(0)[y]);
							}else {
								cptTypes++;
							}
						}
					}
				}
			}
			
			List<Set<String>> clusterClones = clones.values().stream().distinct().collect(Collectors.toList());
			System.out.println( clusterClones.stream().map(set -> set.stream().collect(Collectors.joining(" ; "))).collect(Collectors.joining("\n---------------\n")));
			
			System.out.println("cptOK " + cptOK + " nbClusters: " + clusterClones.size());
			System.out.println("clones: " + (clones.values().size()-clusterClones.size()) + " types: " + cptTypes);
			
//			EcoreFactory.eINSTANCE.eClass();
//			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
//			List<Set<String>> uris = clusterClones.stream().map(MatrixMatchAnalysis::getURICluster).collect(Collectors.toList());
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Set<String> getURICluster(Set<String> paths) {
		Set<String> uris = new HashSet<>();
		
		System.out.println("---");
		
		paths.forEach(p -> {
			ResourceSet rs = new ResourceSetImpl();
			Resource res = rs.getResource(URI.createURI(Main.PATH+p.toString()), true);
			List<EPackage> mm = res.getContents().stream().filter(elt -> elt instanceof EPackage).map(pkg -> (EPackage)pkg).collect(Collectors.<EPackage> toList());
			System.out.println( mm.stream().map(pkg -> pkg.getNsURI()).collect(Collectors.joining("\n+ ")));
			
			 uris.addAll(mm.stream().map(pkg -> pkg.getNsURI()).collect(Collectors.toSet()));
			
			Main.flushResourceSet(rs);
		});
		
		return uris;
	}
	
}
