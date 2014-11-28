package Proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class BookFacadeProxy implements InvocationHandler {  
	
	
	
	private Object target;  
	    /** 
	     * 绑定委托对象并返回一个代理类 
	     * @param target 
	     * @return 
	     */  
	    public Object bind(Object target) {  
	        this.target = target;  
	        //取得代理对象  
	        return Proxy.newProxyInstance(target.getClass().getClassLoader(),  
	                target.getClass().getInterfaces(), this);   //要绑定接口(这是一个缺陷，cglib弥补了这一缺陷)  
	    }  
	    
	    public Object bind(ClassLoader classLoader,Class<?>[] interfaceclass){
	    	 return Proxy.newProxyInstance(classLoader,  
	    			 interfaceclass, this);   //要绑
	    }
	      
	    /** 
	     * 调用方法 
	     */  
	    public Object invoke(Object proxy, Method method, Object[] args)  
	            throws Throwable {  
	        Object result=null;  
	        System.out.println("事务开始");  
	        //执行方法  
	        result=method.invoke(target, args);  
	        System.out.println("事事务结束");  
	        return result;  
	    }  
}  