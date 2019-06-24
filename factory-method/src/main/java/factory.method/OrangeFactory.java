package factory.method;

public class OrangeFactory implements FruitFactory {
	@Override
	public Fruits getFruitjuice() {
		return new Orange();
	}
}
