package k3TransfoFootprint;

import java.util.Map;
import k3TransfoFootprint.XCasePartAspectXCasePartAspectProperties;
import org.eclipse.xtext.xbase.XCasePart;

@SuppressWarnings("all")
public class XCasePartAspectXCasePartAspectContext {
  public final static XCasePartAspectXCasePartAspectContext INSTANCE = new XCasePartAspectXCasePartAspectContext();
  
  public static XCasePartAspectXCasePartAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<XCasePart,XCasePartAspectXCasePartAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.xbase.XCasePart, k3TransfoFootprint.XCasePartAspectXCasePartAspectProperties>();
  
  public Map<XCasePart,XCasePartAspectXCasePartAspectProperties> getMap() {
    return map;
  }
}
