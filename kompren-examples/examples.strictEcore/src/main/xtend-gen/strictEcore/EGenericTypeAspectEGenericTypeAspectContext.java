package strictEcore;

import java.util.Map;
import org.eclipse.emf.ecore.EGenericType;
import strictEcore.EGenericTypeAspectEGenericTypeAspectProperties;

@SuppressWarnings("all")
public class EGenericTypeAspectEGenericTypeAspectContext {
  public final static EGenericTypeAspectEGenericTypeAspectContext INSTANCE = new EGenericTypeAspectEGenericTypeAspectContext();
  
  public static EGenericTypeAspectEGenericTypeAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<EGenericType,EGenericTypeAspectEGenericTypeAspectProperties> map = new java.util.HashMap<org.eclipse.emf.ecore.EGenericType, strictEcore.EGenericTypeAspectEGenericTypeAspectProperties>();
  
  public Map<EGenericType,EGenericTypeAspectEGenericTypeAspectProperties> getMap() {
    return map;
  }
}
