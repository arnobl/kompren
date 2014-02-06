package k3TransfoFootprint;

import java.util.Map;
import k3TransfoFootprint.XFeatureCallAspectXFeatureCallAspectProperties;
import org.eclipse.xtext.xbase.XFeatureCall;

@SuppressWarnings("all")
public class XFeatureCallAspectXFeatureCallAspectContext {
  public final static XFeatureCallAspectXFeatureCallAspectContext INSTANCE = new XFeatureCallAspectXFeatureCallAspectContext();
  
  public static XFeatureCallAspectXFeatureCallAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<XFeatureCall,XFeatureCallAspectXFeatureCallAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.xbase.XFeatureCall, k3TransfoFootprint.XFeatureCallAspectXFeatureCallAspectProperties>();
  
  public Map<XFeatureCall,XFeatureCallAspectXFeatureCallAspectProperties> getMap() {
    return map;
  }
}
