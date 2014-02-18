package strictEcore;

import java.util.Map;
import org.eclipse.emf.ecore.ETypeParameter;
import strictEcore.ETypeParameterAspectETypeParameterAspectProperties;

@SuppressWarnings("all")
public class ETypeParameterAspectETypeParameterAspectContext {
  public final static ETypeParameterAspectETypeParameterAspectContext INSTANCE = new ETypeParameterAspectETypeParameterAspectContext();
  
  public static ETypeParameterAspectETypeParameterAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<ETypeParameter,ETypeParameterAspectETypeParameterAspectProperties> map = new java.util.HashMap<org.eclipse.emf.ecore.ETypeParameter, strictEcore.ETypeParameterAspectETypeParameterAspectProperties>();
  
  public Map<ETypeParameter,ETypeParameterAspectETypeParameterAspectProperties> getMap() {
    return map;
  }
}
