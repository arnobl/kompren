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
import java.util.ArrayList;
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import fr.inria.diverse.melange.lib.EcoreExtensions;
import fr.inria.diverse.melange.lib.MatchingHelper;

public class Main {
	private static final String SEP = ";";
	private static final boolean MATCH = true;
	private static final boolean PROCESS = false;
	private static final String PATH = "/home/ablouin/metamodels/metamodels";
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
		List<Path> paths = getAllFiles();

		try(PrintWriter outAll = new PrintWriter(new BufferedWriter(new FileWriter("resultsAll.txt", false)));
				PrintWriter outSum = new PrintWriter(new BufferedWriter(new FileWriter("resultsSum.txt", false)));
				PrintWriter outMatch = new PrintWriter(new BufferedWriter(new FileWriter("resultsMatch.txt", false)));) {
			paths.forEach(p -> outMatch.print(SEP+p.toString().replaceAll(PATH, "")));
			outMatch.print('\n');
			outMatch.flush();
			paths.forEach(d -> processFile(outAll, outSum, outMatch, d, paths));
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	private static List<Path> getAllFiles() {
		List<Path> files = new ArrayList<>();

		try(DirectoryStream<Path> ds = Files.newDirectoryStream(FileSystems.getDefault().getPath(PATH))) {
			ds.forEach(p -> _addFiles(p, files));
		}catch(Exception ex) {
			ex.printStackTrace();
		}

		return files;
	}

	private static void _addFiles(Path path, List<Path> files) {
		if(Files.isDirectory(path)) {
			try(DirectoryStream<Path> ds = Files.newDirectoryStream(path)) {
				ds.forEach(p -> _addFiles(p, files));
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		}else {
			files.add(path);
		}
	}

	private static List<EPackage> flatPackages(List<EPackage> pkgs) {
		Map<String, EPackage> externs = new HashMap<>();
		List<EPackage> pkg2 = pkgs.stream().map(p -> EXT.getAllSubPkgs(p)).flatMap(List::stream).collect(Collectors.<EPackage> toList());
		pkg2.addAll(pkgs);
		pkg2.forEach(p -> getReferencedPkgsRec(p, externs));
		pkg2.addAll(externs.values());
		return pkg2;
	}
	

	private static void getReferencedPkgsRec(EPackage pkg, Map<String, EPackage> ret) {
		EcoreUtil.ExternalCrossReferencer.find(pkg).keySet().stream().filter(o -> o instanceof EClass).forEach(cls -> {
			EObject container = cls;

			while(container != null && !(container instanceof EPackage))
				container = container.eContainer();

			EPackage referenced = (EPackage)container;
			
			if(referenced != null && ret.get(referenced.getNsURI())==null) {
				ret.put(referenced.getNsURI(), referenced);
				getReferencedPkgsRec(referenced,ret);
			}
		});
	}


	private static void processFile(PrintWriter outAll, PrintWriter outSum, PrintWriter outMatch, Path path, List<Path> paths) {
		ResourceSet rs = new ResourceSetImpl();
		Resource res = rs.getResource(URI.createURI(path.toString()), true);
		Ctx ctx = new Ctx();

		try {
			res.load(Collections.emptyMap());
			// EcoreUtil.resolveAll(res);

			if(PROCESS) {
				res.getContents().forEach(elt -> {
					if(elt instanceof EPackage)
						navigatePkg((EPackage)elt, (EPackage)elt, outAll, path, ctx);
				});
			}

			if(MATCH) {
				List<EPackage> mm1 = flatPackages(res.getContents().parallelStream().filter(elt -> elt instanceof EPackage).map(pkg -> (EPackage)pkg).collect(Collectors.<EPackage> toList()));
				computeNbEClasses(path, mm1);
				outMatch.print(path.toString().replaceAll(PATH, ""));
				paths.forEach(path2 -> match(path, mm1, path2, outMatch));
				outMatch.print('\n');
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

		for(Iterator<Resource> i = rs.getResources().iterator(); i.hasNext();) {
			Resource resource = i.next();
			if(resource != null) {
				try{resource.unload();}catch(Exception ex){}
			}
			try {i.remove();}catch(ConcurrentModificationException ex) {}
		}

		ctx.println(outSum, path);
	}

	private static void match(Path path, List<EPackage> mm, Path d, PrintWriter out) {
		ResourceSet rs = new ResourceSetImpl();
		Resource res = rs.getResource(URI.createURI(d.toString()), true);

		try {
			res.load(Collections.emptyMap());
			// EcoreUtil.resolveAll(res);
			List<EPackage> mm2 = flatPackages(res.getContents().parallelStream().filter(elt -> elt instanceof EPackage).map(pkg -> (EPackage)pkg).collect(Collectors.<EPackage> toList()));
			computeNbEClasses(d, mm2);
			match(path, mm, d, mm2, out);

		}catch(IOException e) {
			e.printStackTrace();
		}

		for(Iterator<Resource> i = rs.getResources().iterator(); i.hasNext();) {
			try{
				Resource resource = i.next();
				if(resource != null) {
					try{resource.unload();}catch(Exception ex){}
				}
				try {i.remove();}catch(ConcurrentModificationException ex) {}
			}catch(Exception e){}
		}
	}

	private static long computeNbEClasses(Path path, List<EPackage> pkgs) {
		Long l = NB_CLASSES.get(path.toString());

		if(l == null) {
			l = EXT.getAllClassifiers(pkgs).parallelStream().filter(elt -> elt instanceof EClass).count();
			NB_CLASSES.put(path.toString(), l);
		}

		return l;
	}

	private static void match(Path path1, List<EPackage> mm1, Path path2, List<EPackage> mm2, PrintWriter out) {
		if(mm1.isEmpty() || mm2.isEmpty() || mm1.get(0) == mm2.get(0))
			return;

		System.out.println(path1.toString().replaceAll(PATH, "") + " " + path2.toString().replaceAll(PATH, ""));
		if(computeNbEClasses(path1, mm1) == 0l) {
			// System.out.println(path1 + ";" + path2+";false;empty1");
			out.print(";fv1");
		}else if(computeNbEClasses(path2, mm2) == 0l) {
			// System.out.println(path1 + ";" + path2+";true;empty2");
			out.print(";tv2");
		}else {
			MatchingHelper match = new MatchingHelper();
			try {
				field.set(match, EXT);
			}catch(IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}

			try {
				boolean res = match.match(mm1, mm2);
				// System.out.println(path1+";"+path2+";"+res);
				out.print(SEP+String.valueOf(res).charAt(0)+"k");
			}catch(Exception ex) {
				ex.printStackTrace();
				// System.out.println(path1+";"+path2+";false;error");
				out.print(";fe");
			}
		}
		out.flush();
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
