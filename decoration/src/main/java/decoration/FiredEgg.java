package decoration;

/**
 * Create by lixinglin on 2018/8/7.
 * At 8:53
 */
public class FiredEgg extends Condiment {
	
	private Pancake pancake;
	
	public FiredEgg(Pancake pancake) {
		this.pancake = pancake;
	}
	
	@Override
	public String getDesc() {
		return pancake.getDesc() + ",煎蛋";
	}
	
	@Override
	public double price() {
		return pancake.price() + 2;
	}
}
