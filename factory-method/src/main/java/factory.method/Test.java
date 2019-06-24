package factory.method;

public class Test {
	
	public static void main(String[] args) {
		FruitFactory fruitFactory = new AppleFactory();
		Fruits fruits = fruitFactory.getFruitjuice();
		fruits.squeezeJuice();
	}
}
