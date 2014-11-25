package ListenerPattern;

import java.util.EventListener;
import java.util.EventObject;

public interface DemoListener extends EventListener{
       public void demoEvent(EventObject dm);
}
