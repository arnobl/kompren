package k3TransfoFootprint;

import java.util.Map;
import k3TransfoFootprint.JvmTypeReferenceAspectJvmTypeReferenceAspectProperties;
import org.eclipse.xtext.common.types.JvmTypeReference;

@SuppressWarnings("all")
public class JvmTypeReferenceAspectJvmTypeReferenceAspectContext {
  public final static JvmTypeReferenceAspectJvmTypeReferenceAspectContext INSTANCE = new JvmTypeReferenceAspectJvmTypeReferenceAspectContext();
  
  public static JvmTypeReferenceAspectJvmTypeReferenceAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<JvmTypeReference,JvmTypeReferenceAspectJvmTypeReferenceAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmTypeReference, k3TransfoFootprint.JvmTypeReferenceAspectJvmTypeReferenceAspectProperties>();
  
  public Map<JvmTypeReference,JvmTypeReferenceAspectJvmTypeReferenceAspectProperties> getMap() {
    return map;
  }
}
