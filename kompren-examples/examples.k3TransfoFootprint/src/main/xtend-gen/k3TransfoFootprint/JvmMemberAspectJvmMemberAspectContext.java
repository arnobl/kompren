package k3TransfoFootprint;

import java.util.Map;
import k3TransfoFootprint.JvmMemberAspectJvmMemberAspectProperties;
import org.eclipse.xtext.common.types.JvmMember;

@SuppressWarnings("all")
public class JvmMemberAspectJvmMemberAspectContext {
  public final static JvmMemberAspectJvmMemberAspectContext INSTANCE = new JvmMemberAspectJvmMemberAspectContext();
  
  public static JvmMemberAspectJvmMemberAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<JvmMember,JvmMemberAspectJvmMemberAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmMember, k3TransfoFootprint.JvmMemberAspectJvmMemberAspectProperties>();
  
  public Map<JvmMember,JvmMemberAspectJvmMemberAspectProperties> getMap() {
    return map;
  }
}
