package k3TransfoFootprint;

import java.util.Map;
import k3TransfoFootprint.JvmFieldAspectJvmFieldAspectProperties;
import org.eclipse.xtext.common.types.JvmField;

@SuppressWarnings("all")
public class JvmFieldAspectJvmFieldAspectContext {
  public final static JvmFieldAspectJvmFieldAspectContext INSTANCE = new JvmFieldAspectJvmFieldAspectContext();
  
  public static JvmFieldAspectJvmFieldAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<JvmField,JvmFieldAspectJvmFieldAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmField, k3TransfoFootprint.JvmFieldAspectJvmFieldAspectProperties>();
  
  public Map<JvmField,JvmFieldAspectJvmFieldAspectProperties> getMap() {
    return map;
  }
}
