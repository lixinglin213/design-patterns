package factory.kit;

public class HaierFactory implements ElectricFactory {
	
	@Override
	public TV createTV() {
		return new HaierTV();
	}
	
	@Override
	public Aircondition createAircondition() {
		return new HaierAircondition();
	}
}
