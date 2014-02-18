package strictEcore;

import java.util.Map;
import org.eclipse.emf.ecore.ENamedElement;
import strictEcore.ENamedElementAspectENamedElementAspectProperties;

@SuppressWarnings("all")
public class ENamedElementAspectENamedElementAspectContext {
  public final static ENamedElementAspectENamedElementAspectContext INSTANCE = new ENamedElementAspectENamedElementAspectContext();
  
  public static ENamedElementAspectENamedElementAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<ENamedElement,ENamedElementAspectENamedElementAspectProperties> map = new java.util.HashMap<org.eclipse.emf.ecore.ENamedElement, strictEcore.ENamedElementAspectENamedElementAspectProperties>();
  
  public Map<ENamedElement,ENamedElementAspectENamedElementAspectProperties> getMap() {
    return map;
  }
}
