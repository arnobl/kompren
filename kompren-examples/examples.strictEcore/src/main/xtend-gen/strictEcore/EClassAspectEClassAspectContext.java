package strictEcore;

import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import strictEcore.EClassAspectEClassAspectProperties;

@SuppressWarnings("all")
public class EClassAspectEClassAspectContext {
  public final static EClassAspectEClassAspectContext INSTANCE = new EClassAspectEClassAspectContext();
  
  public static EClassAspectEClassAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<EClass,EClassAspectEClassAspectProperties> map = new java.util.HashMap<org.eclipse.emf.ecore.EClass, strictEcore.EClassAspectEClassAspectProperties>();
  
  public Map<EClass,EClassAspectEClassAspectProperties> getMap() {
    return map;
  }
}
