package factory.simple;

public class Test {
	//作为一个客户的角色。如果没有工厂的角色，每次都需要知道产品的细节实现来生成产品。耦合性很高
	
	public static void main(String[] args) {
		Fruits fruitsjuice = FruitsFactory.getJuice("orange");
		fruitsjuice.squeezeJuice();
	}
}
