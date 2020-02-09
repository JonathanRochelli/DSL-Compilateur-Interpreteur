package fsm.aspects;

import fr.ut2j.m1ice.fsm.Final;
import fsm.aspects.FinalAspectFinalAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class FinalAspectFinalAspectContext {
  public final static FinalAspectFinalAspectContext INSTANCE = new FinalAspectFinalAspectContext();
  
  public static FinalAspectFinalAspectProperties getSelf(final Final _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fsm.aspects.FinalAspectFinalAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Final, FinalAspectFinalAspectProperties> map = new java.util.WeakHashMap<fr.ut2j.m1ice.fsm.Final, fsm.aspects.FinalAspectFinalAspectProperties>();
  
  public Map<Final, FinalAspectFinalAspectProperties> getMap() {
    return map;
  }
}
