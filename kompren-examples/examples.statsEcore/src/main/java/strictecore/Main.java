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

public class Main {
	private static final String SEP = " ; ";
	private static final boolean MATCH = false;
	private static final boolean PROCESS = true;
	private static final String PATH = "/media/data/dev/kompren/kompren-examples/examples.statsEcore/models"; 
	// "/media/data/dev/kompren/kompren-examples/examples.statsEcore/models" "/media/data/dev/testMM/metamodels"
	
	public static void main(String[] args) {
		EcoreFactory.eINSTANCE.eClass();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());

		try(PrintWriter outAll = new PrintWriter(new BufferedWriter(new FileWriter("resultsAll.txt", false)));
				PrintWriter outSum = new PrintWriter(new BufferedWriter(new FileWriter("resultsSum.txt", false)));
				PrintWriter outMatch = new PrintWriter(new BufferedWriter(new FileWriter("resultsMatch.txt", false)));
				DirectoryStream<Path> ds = Files.newDirectoryStream(FileSystems.getDefault().getPath(PATH));) {
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

			if(PROCESS) {
				res.getContents().forEach(elt -> {
					if(elt instanceof EPackage)
						navigatePkg((EPackage)elt, (EPackage)elt, outAll, path, ctx);
				});
			}

			if(MATCH) {
				match(res.getContents().parallelStream().filter(elt -> elt instanceof EPackage).map(pkg -> (EPackage)pkg).collect(Collectors.<EPackage> toList()));
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

		for(Iterator<Resource> i = rs.getResources().iterator(); i.hasNext();) {
			i.next().unload();
			i.remove();
		}

		ctx.println(outSum, path);
	}

	private static void match(List<EPackage> mm) {
		try(DirectoryStream<Path> ds2 = Files.newDirectoryStream(FileSystems.getDefault().getPath(PATH))) {
			ds2.forEach(d2 -> {
				match(mm, d2);
			});
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	private static void match(List<EPackage> mm, Path d) {
		if(Files.isDirectory(d)) {
			try(DirectoryStream<Path> ds = Files.newDirectoryStream(d)) {
				ds.forEach(d2 -> match(mm, d2));
				ds.close();
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		}else {
			ResourceSet rs = new ResourceSetImpl();
			Resource res = rs.getResource(URI.createURI(d.toString()), true);

			try {
				res.load(Collections.emptyMap());
				match(mm, res.getContents().parallelStream().filter(elt -> elt instanceof EPackage).map(pkg -> (EPackage)pkg).collect(Collectors.<EPackage> toList()));
			}catch(IOException e) {
				e.printStackTrace();
			}

			for(Iterator<Resource> i = rs.getResources().iterator(); i.hasNext();) {
				i.next().unload();
				i.remove();
			}
		}
	}

	private static void match(List<EPackage> mm1, List<EPackage> mm2) {
		if(mm1.isEmpty() || mm2.isEmpty() || mm1.get(0)==mm2.get(0)) return ;
		
		System.out.print("matching: " + mm1 + " " + mm2);
		MatchingHelper match = new MatchingHelper();
		
		boolean res = match.match(mm1, mm2);
		System.out.println(" " + res);
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
			if(cpt > 0) {
				out.println(path + SEP + cpt + SEP + sum + SEP + (sum / (double)cpt));
				out.flush();
			}
		}
	}
}
