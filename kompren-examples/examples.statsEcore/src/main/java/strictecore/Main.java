package strictecore;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

public class Main {
	private static final String SEP = " ; ";

	public static void main(String[] args) {
		EcoreFactory.eINSTANCE.eClass();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		
		try(PrintWriter outAll = new PrintWriter(new BufferedWriter(new FileWriter("resultsAll.txt", false)));
			PrintWriter outSum = new PrintWriter(new BufferedWriter(new FileWriter("resultsSum.txt", false)));
			DirectoryStream<Path> ds = Files.newDirectoryStream(FileSystems.getDefault().getPath("/media/data/dev/testMM/metamodels"));) {
			ds.forEach(d -> process(outAll, outSum, d));
			ds.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}


	private static void process(PrintWriter outAll, PrintWriter outSum, Path d) {
		if(Files.isDirectory(d)) {
			try(DirectoryStream<Path> ds = Files.newDirectoryStream(d)) {
    			ds.forEach(d2 -> process(outAll, outSum, d2));
    			ds.close();
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		}else {
			processFile(outAll, outSum, d);
		}
	}
	
	
	private static void processFile(PrintWriter outAll, PrintWriter outSum, Path path) {
		ResourceSet rs = new ResourceSetImpl();
		Resource res = rs.getResource(URI.createURI(path.toString()), true);
		Ctx ctx = new Ctx();
		
		try {
			res.load(Collections.emptyMap());
			res.getContents().forEach(elt -> {
				if(elt instanceof EPackage) navigatePkg((EPackage)elt, (EPackage)elt, outAll, path, ctx);
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(Iterator<Resource> i = rs.getResources().iterator(); i.hasNext();) {
			i.next().unload();
			i.remove();
		}
		
		ctx.println(outSum, path);
	}
	
	
	private static void navigatePkg(EPackage pkg, EPackage root, PrintWriter out, Path path, Ctx ctx) {
		pkg.getEClassifiers().forEach(cl -> {
			if(cl instanceof EClass) {
    			StrictEcore slicer = new StrictEcore(root, Arrays.asList(cl), true, false); 
    			slicer.slice();
    			ctx.sum += slicer.nbClasses;
    			ctx.cpt++;
    			out.println(path + SEP + cl.getName() + SEP + slicer.nbClasses);
    			out.flush();
    			slicer.reinit();
			}
		});
		pkg.getESubpackages().forEach(pkg2 -> navigatePkg(pkg2, pkg, out, path, ctx));
	}
	
	
	private static class Ctx {
		int cpt = 0;
		int sum = 0;
		
		void println(PrintWriter out, Path path) {
			if(cpt>0) {
    			out.println(path + SEP + cpt + SEP + sum + SEP + (sum/(double)cpt));
    			out.flush();
			}
		}
	}
}



