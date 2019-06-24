package factory.kit;

public class Test {
	
	public static void main(String[] args) {
		ElectricFactory electricFactory = new HaierFactory();
		Aircondition aircondition = electricFactory.createAircondition();
		aircondition.cooling();
	}
}
