package k3TransfoFootprint;

import java.util.Map;
import k3TransfoFootprint.JvmExecutableAspectJvmExecutableAspectProperties;
import org.eclipse.xtext.common.types.JvmExecutable;

@SuppressWarnings("all")
public class JvmExecutableAspectJvmExecutableAspectContext {
  public final static JvmExecutableAspectJvmExecutableAspectContext INSTANCE = new JvmExecutableAspectJvmExecutableAspectContext();
  
  public static JvmExecutableAspectJvmExecutableAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<JvmExecutable,JvmExecutableAspectJvmExecutableAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmExecutable, k3TransfoFootprint.JvmExecutableAspectJvmExecutableAspectProperties>();
  
  public Map<JvmExecutable,JvmExecutableAspectJvmExecutableAspectProperties> getMap() {
    return map;
  }
}
