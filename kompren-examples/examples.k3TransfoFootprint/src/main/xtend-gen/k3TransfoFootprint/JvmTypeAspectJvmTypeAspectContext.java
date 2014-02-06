package k3TransfoFootprint;

import java.util.Map;
import k3TransfoFootprint.JvmTypeAspectJvmTypeAspectProperties;
import org.eclipse.xtext.common.types.JvmType;

@SuppressWarnings("all")
public class JvmTypeAspectJvmTypeAspectContext {
  public final static JvmTypeAspectJvmTypeAspectContext INSTANCE = new JvmTypeAspectJvmTypeAspectContext();
  
  public static JvmTypeAspectJvmTypeAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<JvmType,JvmTypeAspectJvmTypeAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmType, k3TransfoFootprint.JvmTypeAspectJvmTypeAspectProperties>();
  
  public Map<JvmType,JvmTypeAspectJvmTypeAspectProperties> getMap() {
    return map;
  }
}
