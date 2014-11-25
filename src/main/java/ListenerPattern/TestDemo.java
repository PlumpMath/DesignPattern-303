package ListenerPattern;

import java.util.EventObject;

public class TestDemo {
	DemoSource ds;
    public TestDemo(){
       try{
             ds = new DemoSource("zhangsan","郑州",27);
             Listener1 l1 = new Listener1();
             Listener2 l2 = new Listener2();
             Listener3 l3 = new Listener3();
             ds.addDemoListener(l1);
             ds.addDemoListener(l2);
             ds.addDemoListener(l3);
             ds.addDemoListener(new DemoListener(){
                        public void demoEvent(EventObject event){
                        	DemoEventObject obj=  (DemoEventObject)event;
                            System.out.println("Inside listener4...");
                            obj.say2();
                        }
                });
             //鼠标点击按钮触发监听器
             ds.notifyDemoEvent();
       }catch(Exception ex)
       {ex.printStackTrace();}
    }

    public static void main(String args[])
    {
           new TestDemo();

    }

}
