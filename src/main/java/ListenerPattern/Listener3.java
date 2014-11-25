package ListenerPattern;

import java.util.EventObject;

public class Listener3 implements DemoListener

{

       public void demoEvent(EventObject de)

       {
 	      DemoEventObject obj=  (DemoEventObject)de;
          System.out.println("Inside listener3...");
          obj.say2();
       }

}
