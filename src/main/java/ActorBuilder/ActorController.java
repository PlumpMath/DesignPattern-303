package ActorBuilder;


/*
 * 控制器，也常叫做导演角色或者指挥着，这个类适合工厂模式最大的区别所在。主要功能是合并创建者（工厂类）创建的小部件，最终合并成一个大的部件。
 * 
 */
public class ActorController {
	
	//逐步构建复杂产品对象
    public Actor construct(ActorBuilder ab)
    {
           Actor actor;                                                                                         
           ab.buildType();
           ab.buildSex();
           ab.buildFace();
           ab.buildCostume();
           ab.buildHairstyle();
           actor=ab.createActor();
           return actor;
    }
}
