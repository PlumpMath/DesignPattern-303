package BridgePattern;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Image image = new PNGImage();  
        ImageImp imp = new WindowsImp();  
        image.setImageImp(imp); //设置桥接关系 
        image.parseFile("小龙女");  
	}
}
