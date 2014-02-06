package k3TransfoFootprint;

import java.util.Map;
import k3TransfoFootprint.JvmFeatureAspectJvmFeatureAspectProperties;
import org.eclipse.xtext.common.types.JvmFeature;

@SuppressWarnings("all")
public class JvmFeatureAspectJvmFeatureAspectContext {
  public final static JvmFeatureAspectJvmFeatureAspectContext INSTANCE = new JvmFeatureAspectJvmFeatureAspectContext();
  
  public static JvmFeatureAspectJvmFeatureAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<JvmFeature,JvmFeatureAspectJvmFeatureAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmFeature, k3TransfoFootprint.JvmFeatureAspectJvmFeatureAspectProperties>();
  
  public Map<JvmFeature,JvmFeatureAspectJvmFeatureAspectProperties> getMap() {
    return map;
  }
}
