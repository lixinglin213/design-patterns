package factory.kit;

public class HaierAircondition implements Aircondition {
	public HaierAircondition() {
		System.out.println("Haier");
	}
	
	@Override
	public void cooling() {
		System.out.println("降温了");
	}
}
