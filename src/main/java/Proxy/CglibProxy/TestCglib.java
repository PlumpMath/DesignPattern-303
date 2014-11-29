package Proxy.CglibProxy;

public class TestCglib {
	 public static void main(String[] args) {  
	        BookFacadeCglib cglib=new BookFacadeCglib();  
	        BookFacadeImpl bookFacadeImpl = new BookFacadeImpl();
	        System.out.println(bookFacadeImpl);
	        BookFacade bookCglib=(BookFacade)cglib.getInstance(bookFacadeImpl);  
	        bookCglib.addBook("dddd");  
	    }  
	 

}
