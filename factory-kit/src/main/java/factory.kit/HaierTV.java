package factory.kit;

public class HaierTV implements TV {
	public HaierTV() {
		System.out.println("Haier");
	}
	
	@Override
	public void watch() {
		System.out.println("看电视！");
	}
}
