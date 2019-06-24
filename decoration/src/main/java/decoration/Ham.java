package decoration;

/**
 * Create by lixinglin on 2018/8/7.
 * At 8:55
 */
public class Ham extends Condiment {
	
	private Pancake pancake;
	
	public Ham(Pancake pancake) {
		this.pancake = pancake;
	}
	
	@Override
	public String getDesc() {
		return pancake.getDesc() + ",火腿";
	}
	
	@Override
	public double price() {
		return pancake.price() + 1;
	}
}
