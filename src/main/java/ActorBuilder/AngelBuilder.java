package ActorBuilder;

/**
 *天使角色建造器：具体建造者
 * 其实这个类和工厂类对象的作用是一样的，负责创建不同的产品
 *
 */
public class AngelBuilder extends ActorBuilder
{

	//创建角色类型产品
	public void buildType() {
		actor.setType("天使");
	}

	//创建性别产品
	public void buildSex() {
		actor.setSex("女");
	}

	//创建脸型产品
	public void buildFace() {
		actor.setFace("漂亮");
	}

	public void buildCostume() {
		actor.setCostume("白裙");
	}

	public void buildHairstyle() {
		actor.setHairstyle("披肩长发");
	}
}
