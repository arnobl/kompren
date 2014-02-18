package strictEcore;

import java.util.Map;
import org.eclipse.emf.ecore.EPackage;
import strictEcore.EPackageAspectEPackageAspectProperties;

@SuppressWarnings("all")
public class EPackageAspectEPackageAspectContext {
  public final static EPackageAspectEPackageAspectContext INSTANCE = new EPackageAspectEPackageAspectContext();
  
  public static EPackageAspectEPackageAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<EPackage,EPackageAspectEPackageAspectProperties> map = new java.util.HashMap<org.eclipse.emf.ecore.EPackage, strictEcore.EPackageAspectEPackageAspectProperties>();
  
  public Map<EPackage,EPackageAspectEPackageAspectProperties> getMap() {
    return map;
  }
}
