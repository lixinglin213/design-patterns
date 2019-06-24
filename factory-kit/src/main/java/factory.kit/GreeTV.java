package factory.kit;

public class GreeTV implements TV {
	public GreeTV() {
		System.out.println("Gree");
	}
	
	@Override
	public void watch() {
		System.out.println("看电视！");
	}
}
