package strictEcore;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import strictEcore.__SlicerAspect__;

@SuppressWarnings("all")
public class StrictEcore {
  private final List<EClass> inputEClass;
  
  private final List<EObject> clonedElts = new ArrayList<EObject>();
  
  public StrictEcore(final List<EClass> inputEClass) {
    this.inputEClass = inputEClass;
  }
  
  public void slice() {
    if (this.inputEClass!=null) {
      final Procedure1<EClass> _function = new Procedure1<EClass>() {
        public void apply(final EClass it) {
          __SlicerAspect__.visitToAddClasses(it, StrictEcore.this);
        }
      };
      IterableExtensions.<EClass>forEach(this.inputEClass, _function);
    }
    if (this.inputEClass!=null) {
      final Procedure1<EClass> _function_1 = new Procedure1<EClass>() {
        public void apply(final EClass it) {
          __SlicerAspect__.visitToAddRelations(it, StrictEcore.this);
        }
      };
      IterableExtensions.<EClass>forEach(this.inputEClass, _function_1);
    }
    this.save();
  }
  
  public void objectCloned(final EObject object) {
    this.clonedElts.add(object);
  }
  
  public void save() {
    try {
      final Function1<EObject,Boolean> _function = new Function1<EObject,Boolean>() {
        public Boolean apply(final EObject it) {
          EObject _eContainer = it.eContainer();
          return Boolean.valueOf(Objects.equal(_eContainer, null));
        }
      };
      final Iterable<EObject> objs = IterableExtensions.<EObject>filter(this.clonedElts, _function);
      final ResourceSetImpl resSet = new ResourceSetImpl();
      Resource.Factory.Registry _resourceFactoryRegistry = resSet.getResourceFactoryRegistry();
      Map<String,Object> _extensionToFactoryMap = _resourceFactoryRegistry.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put("*", _xMIResourceFactoryImpl);
      URI _createURI = URI.createURI("modelSlice.xmi");
      final Resource res = resSet.createResource(_createURI);
      EList<EObject> _contents = res.getContents();
      Iterables.<EObject>addAll(_contents, objs);
      Map<Object,Object> _emptyMap = Collections.<Object, Object>emptyMap();
      res.save(_emptyMap);
      res.unload();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
