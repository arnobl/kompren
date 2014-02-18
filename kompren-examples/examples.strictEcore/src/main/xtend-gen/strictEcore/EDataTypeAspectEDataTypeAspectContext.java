package strictEcore;

import java.util.Map;
import org.eclipse.emf.ecore.EDataType;
import strictEcore.EDataTypeAspectEDataTypeAspectProperties;

@SuppressWarnings("all")
public class EDataTypeAspectEDataTypeAspectContext {
  public final static EDataTypeAspectEDataTypeAspectContext INSTANCE = new EDataTypeAspectEDataTypeAspectContext();
  
  public static EDataTypeAspectEDataTypeAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<EDataType,EDataTypeAspectEDataTypeAspectProperties> map = new java.util.HashMap<org.eclipse.emf.ecore.EDataType, strictEcore.EDataTypeAspectEDataTypeAspectProperties>();
  
  public Map<EDataType,EDataTypeAspectEDataTypeAspectProperties> getMap() {
    return map;
  }
}
