package strictEcore;

import java.util.Map;
import org.eclipse.emf.ecore.EParameter;
import strictEcore.EParameterAspectEParameterAspectProperties;

@SuppressWarnings("all")
public class EParameterAspectEParameterAspectContext {
  public final static EParameterAspectEParameterAspectContext INSTANCE = new EParameterAspectEParameterAspectContext();
  
  public static EParameterAspectEParameterAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<EParameter,EParameterAspectEParameterAspectProperties> map = new java.util.HashMap<org.eclipse.emf.ecore.EParameter, strictEcore.EParameterAspectEParameterAspectProperties>();
  
  public Map<EParameter,EParameterAspectEParameterAspectProperties> getMap() {
    return map;
  }
}
