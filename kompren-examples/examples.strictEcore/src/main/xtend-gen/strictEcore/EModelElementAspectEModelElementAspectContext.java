package strictEcore;

import java.util.Map;
import org.eclipse.emf.ecore.EModelElement;
import strictEcore.EModelElementAspectEModelElementAspectProperties;

@SuppressWarnings("all")
public class EModelElementAspectEModelElementAspectContext {
  public final static EModelElementAspectEModelElementAspectContext INSTANCE = new EModelElementAspectEModelElementAspectContext();
  
  public static EModelElementAspectEModelElementAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<EModelElement,EModelElementAspectEModelElementAspectProperties> map = new java.util.HashMap<org.eclipse.emf.ecore.EModelElement, strictEcore.EModelElementAspectEModelElementAspectProperties>();
  
  public Map<EModelElement,EModelElementAspectEModelElementAspectProperties> getMap() {
    return map;
  }
}
