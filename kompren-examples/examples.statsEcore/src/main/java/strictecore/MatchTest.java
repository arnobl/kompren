package strictecore;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import fr.inria.diverse.melange.lib.MatchingHelper;

public class MatchTest {

	public static void main(String[] args) {
		EcoreFactory.eINSTANCE.eClass();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		ResourceSet rs = new ResourceSetImpl();
		Resource res = rs.getResource(URI.createURI("/media/data/dev/testMM/metamodels/elexis/elexis-3-core/ch.elexis.core/model/model.ecore"), true);
		
		try {
			res.load(Collections.emptyMap());
			List<EPackage> mm1 = Main.flatPackages(res.getContents().parallelStream().filter(elt -> elt instanceof EPackage).
												map(pkg -> (EPackage)pkg).collect(Collectors.<EPackage> toList()));
			System.out.println(mm1.size() + " " + mm1.get(0));
			
			MatchingHelper match = new MatchingHelper();
			try {
				Main.field.set(match, Main.EXT);
			}catch(IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}

			System.out.println( match.match(mm1, mm1) );
			
			List<EClass> cls = Main.EXT.getAllClassifiers(mm1).stream().filter(cl -> cl instanceof EClass).map(cl -> (EClass) cl).collect(Collectors.toList());
			System.out.println(cls);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
