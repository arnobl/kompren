package fr.inria.diverse.kompren.explen.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.kermeta.kompren.diagram.view.interfaces.IRelationView;
import org.malai.presentation.Presentation;

import fr.inria.diverse.kompren.explen.model.Model;
import fr.inria.diverse.kompren.explen.model.ModelUtils;

public final class ModelViewMapper {
	private static ModelViewMapper instance;

	protected Presentation<Model, MetamodelView> presentation;

	protected Map<String, List<EClass>> cdAdded;

	protected Map<EClass, ClassView> classMappings;

	protected Map<ClassView, EClass> classMappingsInverted;

	protected Map<String, InheritanceView> addedInheritances;
	
	protected Map<String, RelationClassView> addedReferences;


	public static ModelViewMapper getMapper() {
		return instance;
	}


	public static void initMapper(final Presentation<Model, MetamodelView> presentation) {
		if(instance!=null)
			instance.flush();

		instance = new ModelViewMapper(presentation);
	}


	private ModelViewMapper(final Presentation<Model, MetamodelView> presentation) {
		super();

		this.presentation = presentation;
		cdAdded = new HashMap<>();
		classMappings = new IdentityHashMap<>();
		classMappingsInverted = new IdentityHashMap<>();
		addedInheritances = new HashMap<>();
		addedReferences = new HashMap<>();
	}


	private void flush() {
		cdAdded.clear();
		classMappings.clear();
		classMappingsInverted.clear();
		addedInheritances.clear();
		addedReferences.clear();
	}



	public ClassView getClassView(final EClass cd) {
		return classMappings.get(cd);
	}


	public List<EClass> getClassDefinitionAdded() {
		return cdAdded.values().stream().flatMap(List::stream).collect(Collectors.toList());
	}
	
	
	public void removeRelationClassView(final EReference prop) {
		addedReferences.remove(prop.getName()+prop.getEContainingClass().getName());
	}
	
	
	public RelationClassView getRelationClassView(final EReference prop) {
		if(addedReferences.get(prop.getName()+prop.getEContainingClass().getName())==null) {
			System.out.println(addedReferences.keySet());
		}
		return addedReferences.get(prop.getName()+prop.getEContainingClass().getName());
	}
	
	
	public InheritanceView getInheritanceView(EClass td1, EClass td2) {
		return addedInheritances.get(ModelUtils.INSTANCE.getQualifiedName(td1)+","+ModelUtils.INSTANCE.getQualifiedName(td2));
	}


	public EClass getClassDefinition(final ClassView cv) {
		return classMappingsInverted.get(cv);
	}



	private Optional<EObject> loadEcore(final String uriKmModel) {
		if(!EPackage.Registry.INSTANCE.containsKey(EcorePackage.eNS_URI))
			EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		
    	ResourceSet resourceSet = new ResourceSetImpl();
		URI uri = URI.createURI(uriKmModel);
		Resource resource = resourceSet.getResource(uri, true);

		return resource.getContents().stream().filter(o -> o instanceof EPackage).findFirst();
	}



	public void build(final String uriMetamodel) {
		Optional<EObject> mu = loadEcore(uriMetamodel);

		if(mu.isPresent()) {
			final EPackage mm = (EPackage)mu.get();
			final MetamodelView view = presentation.getConcretePresentation();

			flush();
			presentation.getAbstractPresentation().setModel(mm);
			view.getEntities().clear();
			view.getRelations().clear();
			createPackageView(mm, view);
			createRelationsView(view);
			view.updateLayout();
			view.update();
		}
	}


	public ClassView getClassView(final String qualifedName) {
		List<EClass> cds = cdAdded.get(qualifedName);

		if(cds!=null)
			for(EClass cd : cds)
				if(classMappings.get(cd)!=null)
					return classMappings.get(cd);
		return null;
	}


	private void createRelationsView(final MetamodelView view) {
		cdAdded.values().forEach(list -> list.forEach(cd -> {
			createInheritanceView(cd, ModelUtils.INSTANCE.getQualifiedName(cd), view);
			createReferences(cd, view);
		}));
	}



	private void createInheritanceView(final EClass cd, final String qname, final MetamodelView view) {
		for(EClass type : cd.getESuperTypes()) {
			String qname2 = ModelUtils.INSTANCE.getQualifiedName(type);
			if(qname.length()>0 && qname2.length()>2 && addedInheritances.get(qname+","+qname2)==null) {
				InheritanceView in = view.addInheritanceView(classMappings.get(cd), classMappings.get(cdAdded.get(qname2).get(0)));
				addedInheritances.put(qname+","+qname2, in);
			}
		}
	}


	private void createPackageView(final EPackage pkg, final MetamodelView view) {
		pkg.getEClassifiers().stream().filter(cl -> cl instanceof EClass).forEach(cl -> createClassDefinition((EClass)cl, view));
		pkg.getESubpackages().forEach(p -> createPackageView(p, view));
	}


	private void createClassDefinition(final EClass cd, final MetamodelView view) {
		List<EClass> cds = new ArrayList<>();
		final ClassView cv = new ClassView(cd.getName(), ModelUtils.INSTANCE.getQualifiedName(cd), cd.isAbstract(), view);
		cds.add(cd);
		addAttributes(cd, cv);
		cd.getEOperations().forEach(op -> cv.addOperation(op.getName(), ModelUtils.INSTANCE.getTypeName(op), false));
		view.addEntity(cv);
		cdAdded.put(ModelUtils.INSTANCE.getQualifiedName(cd), cds);

		classMappings.put(cd, cv);
		classMappingsInverted.put(cv, cd);
	}



	private void createReferences(final EClass cd, final MetamodelView mv) {
		EClass type;
		boolean oppositeCompo;
		String oppositeCardString;
		String oppositeName;
		EReference opp;
		ClassView cv = classMappings.get(cd);

		for(EReference prop : cd.getEReferences()) {
			type = prop.getEReferenceType();
			oppositeCompo = prop.isContainment();
			oppositeCardString = "";
			oppositeName = "";

			if(prop.getEOpposite() != null) {
				opp = prop.getEOpposite();
				oppositeName  = opp.getName();
				oppositeCompo = opp.isContainment();
				oppositeCardString = ModelUtils.INSTANCE.getCardinalityString(opp);
			}
			addReference(type, oppositeCompo, prop, oppositeCardString, oppositeName, cv, mv);
		}
	}
	
	
	public void addReference(RelationClassView rcv, EReference prop) {
		addedReferences.put(prop.getName()+prop.getEType().getName(), rcv);
	}
	
	
	public void addReference(EClass type, boolean oppositeCompo, EReference prop, String opposCardStr, String oppositeName, ClassView cv, MetamodelView mv) {
		ClassView cv2 = classMappings.get(type);
		IRelationView relV = mv.addRelation(cv, cv2, prop.isContainment() || oppositeCompo, prop.isContainment(),
								prop.getName(), oppositeName, ModelUtils.INSTANCE.getCardinalityString(prop), opposCardStr);
		if(relV==null)
			relV = mv.getOppositeRelation(cv, cv2, prop.getName(), oppositeName, ModelUtils.INSTANCE.getCardinalityString(prop));
		addedReferences.put(prop.getName()+prop.getEType().getName(), (RelationClassView) relV);
	}


	private void addAttributes(final EClass cd, final ClassView cv) {
		cd.getEAttributes().forEach(attr -> cv.addAttribute(attr.getName(),  attr.getEType().getName()));
	}
}
