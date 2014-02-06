package k3TransfoFootprint;

import java.util.Map;
import k3TransfoFootprint.JvmOperationAspectJvmOperationAspectProperties;
import org.eclipse.xtext.common.types.JvmOperation;

@SuppressWarnings("all")
public class JvmOperationAspectJvmOperationAspectContext {
  public final static JvmOperationAspectJvmOperationAspectContext INSTANCE = new JvmOperationAspectJvmOperationAspectContext();
  
  public static JvmOperationAspectJvmOperationAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<JvmOperation,JvmOperationAspectJvmOperationAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmOperation, k3TransfoFootprint.JvmOperationAspectJvmOperationAspectProperties>();
  
  public Map<JvmOperation,JvmOperationAspectJvmOperationAspectProperties> getMap() {
    return map;
  }
}
