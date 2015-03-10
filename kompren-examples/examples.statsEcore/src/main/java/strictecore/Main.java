package strictecore;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import fr.inria.diverse.melange.lib.EcoreExtensions;
import fr.inria.diverse.melange.lib.MatchingHelper;

public class Main {
	private static final String SEP = " ; ";
	private static final boolean MATCH = true;
	private static final boolean PROCESS = false;
	private static final String PATH = "/media/data/dev/testMM/metamodels";
	private static final EcoreExtensions EXT = new EcoreExtensions();
	// "/media/data/dev/kompren/kompren-examples/examples.statsEcore/models"
	// "/media/data/dev/testMM/metamodels"
	final static Map<String, Long> NB_CLASSES = new HashMap<>();

	private static Field field;

	static {
		try {
			field = MatchingHelper.class.getDeclaredField("_ecoreExtensions");
			field.setAccessible(true);
		}catch(NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		EcoreFactory.eINSTANCE.eClass();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());

		try(PrintWriter outAll = new PrintWriter(new BufferedWriter(new FileWriter("resultsAll.txt", false)));
				PrintWriter outSum = new PrintWriter(new BufferedWriter(new FileWriter("resultsSum.txt", false)));
				PrintWriter outMatch = new PrintWriter(new BufferedWriter(new FileWriter("resultsMatch.txt", false)));
				DirectoryStream<Path> ds = Files.newDirectoryStream(FileSystems.getDefault().getPath(PATH));) {
			ds.forEach(d -> process(outAll, outSum, outMatch, d));
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
	private static List<EPackage> flatPackages(List<EPackage> pkgs) {
		List<EPackage> pkg2 = pkgs.stream().map(p -> EXT.getAllSubPkgs(p)).flatMap(l->l.stream()).collect(Collectors.<EPackage>toList());
		pkg2.addAll(pkgs);
		List<EPackage> externs = pkg2.parallelStream().map(p -> EXT.getReferencedPkgs(p)).flatMap(l->l.stream()).collect(Collectors.<EPackage>toList());
		pkg2.addAll(externs);
		return pkg2;
	}
	

	private static void process(PrintWriter outAll, PrintWriter outSum, PrintWriter outMatch, Path d) {
		if(Files.isDirectory(d)) {
			try(DirectoryStream<Path> ds = Files.newDirectoryStream(d)) {
				ds.forEach(d2 -> process(outAll, outSum, outMatch, d2));
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		}else {
			processFile(outAll, outSum, outMatch, d);
		}
	}

	private static void processFile(PrintWriter outAll, PrintWriter outSum, PrintWriter outMatch, Path path) {
		ResourceSet rs = new ResourceSetImpl();
		Resource res = rs.getResource(URI.createURI(path.toString()), true);
		Ctx ctx = new Ctx();

		try {
			res.load(Collections.emptyMap());
//			EcoreUtil.resolveAll(res);
				
			if(PROCESS) {
				res.getContents().forEach(elt -> {
					if(elt instanceof EPackage)
						navigatePkg((EPackage)elt, (EPackage)elt, outAll, path, ctx);
				});
			}

			if(MATCH) {
				List<EPackage> mm1 = flatPackages(res.getContents().parallelStream().filter(elt -> elt instanceof EPackage).
													map(pkg -> (EPackage)pkg).collect(Collectors.<EPackage> toList()));
				computeNbEClasses(path, mm1);
				match(path, mm1, outMatch);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

//		try {res.unload();}catch(Exception ex) {}
		
		for(Iterator<Resource> i = rs.getResources().iterator(); i.hasNext();) {
			Resource resource = i.next();
			if(resource!=null) {
				resource.unload();
			}
			try{ i.remove();}catch(ConcurrentModificationException ex){}
		}

		ctx.println(outSum, path);
	}

	private static void match(Path path, List<EPackage> mm, PrintWriter out) {
		try(DirectoryStream<Path> ds2 = Files.newDirectoryStream(FileSystems.getDefault().getPath(PATH))) {
			ds2.forEach(d2 -> match(path, mm, d2, out));
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	private static void match(Path path, List<EPackage> mm, Path d, PrintWriter out) {
		if(Files.isDirectory(d)) {
			try(DirectoryStream<Path> ds = Files.newDirectoryStream(d)) {
				ds.forEach(d2 -> match(path, mm, d2, out));
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		}else {
			ResourceSet rs = new ResourceSetImpl();
			Resource res = rs.getResource(URI.createURI(d.toString()), true);

			try {
				res.load(Collections.emptyMap());
//				EcoreUtil.resolveAll(res);
				List<EPackage> mm2 = flatPackages(res.getContents().parallelStream().filter(elt -> elt instanceof EPackage).
												map(pkg -> (EPackage)pkg).collect(Collectors.<EPackage> toList()));
				computeNbEClasses(d, mm2);
				match(path, mm, d, mm2, out);
				
			}catch(IOException e) {
				e.printStackTrace();
			}
			
//			try {res.unload();}catch(Exception ex) {}

			for(Iterator<Resource> i = rs.getResources().iterator(); i.hasNext();) {
				Resource resource = i.next();
				if(resource!=null) {
					resource.unload();
				}
				try{ i.remove();}catch(ConcurrentModificationException ex){}
			}
		}
	}
	
	
	private static long computeNbEClasses(Path path, List<EPackage> pkgs) {
		Long l = NB_CLASSES.get(path.toString());
		
		if(l==null) {
			l = EXT.getAllClassifiers(pkgs).parallelStream().filter(elt -> elt instanceof EClass).count();
			NB_CLASSES.put(path.toString(), l);
		}
		
		return l;
	}
	

	private static void match(Path path1, List<EPackage> mm1, Path path2, List<EPackage> mm2, PrintWriter out) {
		if(mm1.isEmpty() || mm2.isEmpty() || mm1.get(0) == mm2.get(0))
			return;

		if(computeNbEClasses(path1, mm1)==0l) {
//			System.out.println(path1 + ";" + path2+";false;empty1");
			out.println(path1 + ";" + path2+";falseEmpty1");
			out.flush();
		}else if(computeNbEClasses(path2, mm2)==0l) {
//			System.out.println(path1 + ";" + path2+";true;empty2");
			out.println(path1 + ";" + path2+";trueEmpty2");
			out.flush();
		}else {
			MatchingHelper match = new MatchingHelper();
			try {
				field.set(match, EXT);
			}catch(IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
	
			try {
				boolean res = match.match(mm1, mm2);
//					System.out.println(path1+";"+path2+";"+res);
					out.println(path1+";"+path2+";"+res+"OK");
					out.flush();
			}catch(Exception ex) {
				ex.printStackTrace();
//				System.out.println(path1+";"+path2+";false;error");
				out.println(path1+";"+path2+";falseError");
				out.flush();
			}
		}
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
