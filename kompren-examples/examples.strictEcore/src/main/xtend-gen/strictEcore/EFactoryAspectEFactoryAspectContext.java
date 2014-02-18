package strictEcore;

import java.util.Map;
import org.eclipse.emf.ecore.EFactory;
import strictEcore.EFactoryAspectEFactoryAspectProperties;

@SuppressWarnings("all")
public class EFactoryAspectEFactoryAspectContext {
  public final static EFactoryAspectEFactoryAspectContext INSTANCE = new EFactoryAspectEFactoryAspectContext();
  
  public static EFactoryAspectEFactoryAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<EFactory,EFactoryAspectEFactoryAspectProperties> map = new java.util.HashMap<org.eclipse.emf.ecore.EFactory, strictEcore.EFactoryAspectEFactoryAspectProperties>();
  
  public Map<EFactory,EFactoryAspectEFactoryAspectProperties> getMap() {
    return map;
  }
}
