package factory.simple;

public class FruitsFactory {
	
	public static Fruits getJuice(String juiceType) {
		switch (juiceType) {
			case "orange":
				return new Orange();
			case "apple":
				return new Apple();
			default:
				return null;
		}
	}
}
