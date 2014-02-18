package strictEcore;

import java.util.Map;
import org.eclipse.emf.ecore.EAttribute;
import strictEcore.EAttributeAspectEAttributeAspectProperties;

@SuppressWarnings("all")
public class EAttributeAspectEAttributeAspectContext {
  public final static EAttributeAspectEAttributeAspectContext INSTANCE = new EAttributeAspectEAttributeAspectContext();
  
  public static EAttributeAspectEAttributeAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<EAttribute,EAttributeAspectEAttributeAspectProperties> map = new java.util.HashMap<org.eclipse.emf.ecore.EAttribute, strictEcore.EAttributeAspectEAttributeAspectProperties>();
  
  public Map<EAttribute,EAttributeAspectEAttributeAspectProperties> getMap() {
    return map;
  }
}
