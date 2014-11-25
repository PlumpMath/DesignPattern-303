package ListenerPattern;

import java.util.EventObject;
public class DemoEventObject extends EventObject
{
	Object obj;
	public DemoEventObject(Object source){
		super(source);
		obj = source;
	}

	public Object getSource(){
		return obj;
	}

	public void say(){
		DemoSource dd = (DemoSource)obj;
		System.out.println("This is say method..."+dd.getButtonName());
	}
	public void say1(){
		DemoSource dd = (DemoSource)obj;
		System.out.println("This is say method..."+dd.getAddress());
	}
	public void say2(){
		DemoSource dd = (DemoSource)obj;
		System.out.println("This is say method..."+dd.getAge());
	}
}
