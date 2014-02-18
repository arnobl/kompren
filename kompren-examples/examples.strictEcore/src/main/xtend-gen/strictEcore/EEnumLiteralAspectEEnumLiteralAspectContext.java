package strictEcore;

import java.util.Map;
import org.eclipse.emf.ecore.EEnumLiteral;
import strictEcore.EEnumLiteralAspectEEnumLiteralAspectProperties;

@SuppressWarnings("all")
public class EEnumLiteralAspectEEnumLiteralAspectContext {
  public final static EEnumLiteralAspectEEnumLiteralAspectContext INSTANCE = new EEnumLiteralAspectEEnumLiteralAspectContext();
  
  public static EEnumLiteralAspectEEnumLiteralAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<EEnumLiteral,EEnumLiteralAspectEEnumLiteralAspectProperties> map = new java.util.HashMap<org.eclipse.emf.ecore.EEnumLiteral, strictEcore.EEnumLiteralAspectEEnumLiteralAspectProperties>();
  
  public Map<EEnumLiteral,EEnumLiteralAspectEEnumLiteralAspectProperties> getMap() {
    return map;
  }
}
