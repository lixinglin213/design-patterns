package factory.kit;

public class GreeFactory implements ElectricFactory {
	
	@Override
	public TV createTV() {
		return new GreeTV();
	};
	
	@Override
	public Aircondition createAircondition() {
		return new GreeAircondition();
	}
	
}
