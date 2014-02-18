package strictEcore;

import java.util.Map;
import org.eclipse.emf.ecore.EClassifier;
import strictEcore.EClassifierAspectEClassifierAspectProperties;

@SuppressWarnings("all")
public class EClassifierAspectEClassifierAspectContext {
  public final static EClassifierAspectEClassifierAspectContext INSTANCE = new EClassifierAspectEClassifierAspectContext();
  
  public static EClassifierAspectEClassifierAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<EClassifier,EClassifierAspectEClassifierAspectProperties> map = new java.util.HashMap<org.eclipse.emf.ecore.EClassifier, strictEcore.EClassifierAspectEClassifierAspectProperties>();
  
  public Map<EClassifier,EClassifierAspectEClassifierAspectProperties> getMap() {
    return map;
  }
}
