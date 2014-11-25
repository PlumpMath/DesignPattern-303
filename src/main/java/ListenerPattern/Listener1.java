package ListenerPattern;

import java.util.EventObject;


public class Listener1 implements DemoListener

{

       public void demoEvent(EventObject de)
       {
    	   DemoEventObject obj=  (DemoEventObject)de;
	       System.out.println("Inside listener1...:");
	       obj.say();

       }

}
