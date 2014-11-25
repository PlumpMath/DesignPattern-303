package ListenerPattern;

import java.util.Enumeration;
import java.util.Vector;

public class DemoSource {
	 private Vector repository = new Vector();
     DemoListener dl;
     public String buttonName;
     public String address;
     public int age;
     public DemoSource(String name,String address,int age)
     {
    	 this.buttonName = name;
    	 this.address = address;
    	 this.age = age;
     }

     /**
      * 添加监听器
      * @param dl
      */
     public void addDemoListener(DemoListener dl)
     {
            repository.addElement(dl);
     }

     /**
      * 触发事件
      */
     public void notifyDemoEvent()

     {
	        Enumeration elements = repository.elements();
	        while(elements.hasMoreElements())
	        {
	              dl = (DemoListener)elements.nextElement();
	              dl.demoEvent(new DemoEventObject(this));
	        }
     }

	public String getButtonName() {
		return buttonName;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

	
}
