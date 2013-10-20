package ex.classModel;

import ex.classModel.SlicerVisitorObjectAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class SlicerVisitorObjectAspectContext {
  public final static SlicerVisitorObjectAspectContext INSTANCE = new SlicerVisitorObjectAspectContext();
  
  public static SlicerVisitorObjectAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<Object,SlicerVisitorObjectAspectProperties> map = new java.util.HashMap<java.lang.Object, ex.classModel.SlicerVisitorObjectAspectProperties>();
  
  public Map<Object,SlicerVisitorObjectAspectProperties> getMap() {
    return map;
  }
}
