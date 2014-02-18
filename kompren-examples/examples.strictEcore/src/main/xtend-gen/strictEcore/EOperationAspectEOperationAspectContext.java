package strictEcore;

import java.util.Map;
import org.eclipse.emf.ecore.EOperation;
import strictEcore.EOperationAspectEOperationAspectProperties;

@SuppressWarnings("all")
public class EOperationAspectEOperationAspectContext {
  public final static EOperationAspectEOperationAspectContext INSTANCE = new EOperationAspectEOperationAspectContext();
  
  public static EOperationAspectEOperationAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<EOperation,EOperationAspectEOperationAspectProperties> map = new java.util.HashMap<org.eclipse.emf.ecore.EOperation, strictEcore.EOperationAspectEOperationAspectProperties>();
  
  public Map<EOperation,EOperationAspectEOperationAspectProperties> getMap() {
    return map;
  }
}
