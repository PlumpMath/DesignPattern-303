package BridgePattern;

abstract class Image {
	
	protected ImageImp imp;  
	/**
	 * 通过设置SET方法，而且不是像装饰模式那样通过构造方法来关联  来桥接另外维度的变化，
	 * 当然也可以创建新的属性，来桥接更多的变化维度
	 */
    public void setImageImp(ImageImp imp) {  
        this.imp = imp;  
    }   
    public abstract void parseFile(String fileName);  
}
