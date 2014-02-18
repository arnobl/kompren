package strictEcore;

import java.util.Map;
import org.eclipse.emf.ecore.ETypedElement;
import strictEcore.ETypedElementAspectETypedElementAspectProperties;

@SuppressWarnings("all")
public class ETypedElementAspectETypedElementAspectContext {
  public final static ETypedElementAspectETypedElementAspectContext INSTANCE = new ETypedElementAspectETypedElementAspectContext();
  
  public static ETypedElementAspectETypedElementAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<ETypedElement,ETypedElementAspectETypedElementAspectProperties> map = new java.util.HashMap<org.eclipse.emf.ecore.ETypedElement, strictEcore.ETypedElementAspectETypedElementAspectProperties>();
  
  public Map<ETypedElement,ETypedElementAspectETypedElementAspectProperties> getMap() {
    return map;
  }
}
