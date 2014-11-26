package ActorBuilder;

/**
 * 抽象建造者通常提供：
 * 1、穿件各个组件的服务
 * 2、返回组件
 */
public abstract class ActorBuilder {
	 protected  Actor actor = new Actor();
     
     public  abstract void buildType();
     public  abstract void buildSex();
     public  abstract void buildFace();
     public  abstract void buildCostume();
     public  abstract void buildHairstyle();

  //工厂方法，返回一个完整的游戏角色对象
     public Actor createActor()
     {
           return actor;
     }
     

}
