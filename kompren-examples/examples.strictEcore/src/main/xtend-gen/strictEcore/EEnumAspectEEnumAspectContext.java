package strictEcore;

import java.util.Map;
import org.eclipse.emf.ecore.EEnum;
import strictEcore.EEnumAspectEEnumAspectProperties;

@SuppressWarnings("all")
public class EEnumAspectEEnumAspectContext {
  public final static EEnumAspectEEnumAspectContext INSTANCE = new EEnumAspectEEnumAspectContext();
  
  public static EEnumAspectEEnumAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<EEnum,EEnumAspectEEnumAspectProperties> map = new java.util.HashMap<org.eclipse.emf.ecore.EEnum, strictEcore.EEnumAspectEEnumAspectProperties>();
  
  public Map<EEnum,EEnumAspectEEnumAspectProperties> getMap() {
    return map;
  }
}
