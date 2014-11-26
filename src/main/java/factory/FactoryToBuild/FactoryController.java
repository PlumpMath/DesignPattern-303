package factory.FactoryToBuild;

import factory.abstractFactory.Button;
import factory.abstractFactory.ComboBox;
import factory.abstractFactory.SkinFactory;
import factory.abstractFactory.TextField;

/**
 *对抽象工厂加入控制器（指挥着），其实工厂模式就转换为建造者模式。
 *也就是说如果把工厂模式的客户端变成现在控制器，其实他们效果是一样的，
 *只是根据不同的业务需求而加入了不同的控制器
 */
public class FactoryController {
	
	public Windows crateteSummberWindow(){
		SkinFactory factory = null;
		Button bt = factory.createButton();
		TextField tf = factory.createTextField();
		ComboBox cb = factory.createComboBox();
		Windows window = new Windows();
		window.setButton(bt);
		window.setTextField(tf);
		window.setComBox(cb);
		return window;
	}

}
