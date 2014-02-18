package strictEcore;

import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import strictEcore.EObjectAspectEObjectAspectProperties;

@SuppressWarnings("all")
public class EObjectAspectEObjectAspectContext {
  public final static EObjectAspectEObjectAspectContext INSTANCE = new EObjectAspectEObjectAspectContext();
  
  public static EObjectAspectEObjectAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<EObject,EObjectAspectEObjectAspectProperties> map = new java.util.HashMap<org.eclipse.emf.ecore.EObject, strictEcore.EObjectAspectEObjectAspectProperties>();
  
  public Map<EObject,EObjectAspectEObjectAspectProperties> getMap() {
    return map;
  }
}
