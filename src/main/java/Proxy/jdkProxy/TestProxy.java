package Proxy.jdkProxy;

public class TestProxy {
	   public static void main(String[] args) {  
	    /*    BookFacadeProxy proxy = new BookFacadeProxy();  
	        BookFacade bookProxy = (BookFacade) proxy.bind(new BookFacadeImpl());  
	        bookProxy.addBook("zhangsan");   */
	        
		   BookFacadeProxy proxy = new BookFacadeProxy();  
	        BookFacade bookProxy2 = (BookFacade) proxy.bind(Thread.currentThread().getContextClassLoader(),new Class[]{BookFacade.class});  
	        bookProxy2.addBook("zhangsan"); 
		   
		  /* System.out.println(ClassLoader.getSystemClassLoader()); // 当前线程的类加载器
		   	System.out.println(Thread.currentThread().getContextClassLoader()); // 当前线程的类加载器
	        System.out.println(TestProxy.class.getClassLoader()); // 当前类的类加载器
	        System.out.println(ClassLoader.getSystemClassLoader()); // 系统初始的类加载器
	        */
	       
	    }  

}
