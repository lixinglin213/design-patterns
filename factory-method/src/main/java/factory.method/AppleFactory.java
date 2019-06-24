package factory.method;

public class AppleFactory implements FruitFactory {
	
	@Override
	public Fruits getFruitjuice() {
		return new Apple();
	}
}
