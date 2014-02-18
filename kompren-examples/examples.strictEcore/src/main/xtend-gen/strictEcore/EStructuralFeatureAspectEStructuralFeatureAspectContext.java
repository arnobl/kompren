package strictEcore;

import java.util.Map;
import org.eclipse.emf.ecore.EStructuralFeature;
import strictEcore.EStructuralFeatureAspectEStructuralFeatureAspectProperties;

@SuppressWarnings("all")
public class EStructuralFeatureAspectEStructuralFeatureAspectContext {
  public final static EStructuralFeatureAspectEStructuralFeatureAspectContext INSTANCE = new EStructuralFeatureAspectEStructuralFeatureAspectContext();
  
  public static EStructuralFeatureAspectEStructuralFeatureAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<EStructuralFeature,EStructuralFeatureAspectEStructuralFeatureAspectProperties> map = new java.util.HashMap<org.eclipse.emf.ecore.EStructuralFeature, strictEcore.EStructuralFeatureAspectEStructuralFeatureAspectProperties>();
  
  public Map<EStructuralFeature,EStructuralFeatureAspectEStructuralFeatureAspectProperties> getMap() {
    return map;
  }
}
