package strictEcore;

import java.util.Map;
import org.eclipse.emf.ecore.EReference;
import strictEcore.EReferenceAspectEReferenceAspectProperties;

@SuppressWarnings("all")
public class EReferenceAspectEReferenceAspectContext {
  public final static EReferenceAspectEReferenceAspectContext INSTANCE = new EReferenceAspectEReferenceAspectContext();
  
  public static EReferenceAspectEReferenceAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<EReference,EReferenceAspectEReferenceAspectProperties> map = new java.util.HashMap<org.eclipse.emf.ecore.EReference, strictEcore.EReferenceAspectEReferenceAspectProperties>();
  
  public Map<EReference,EReferenceAspectEReferenceAspectProperties> getMap() {
    return map;
  }
}
