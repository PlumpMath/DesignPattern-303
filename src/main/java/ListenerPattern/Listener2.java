package ListenerPattern;

import java.util.EventObject;

public class Listener2 implements DemoListener

{

       public void demoEvent(EventObject de)

       {
    	      DemoEventObject obj=  (DemoEventObject)de;
              System.out.println("Inside listener2...");
              obj.say1();
       }

}
