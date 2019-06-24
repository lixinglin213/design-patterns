package decoration;

/**
 * Create by lixinglin on 2018/8/7.
 * At 8:46
 */
public class TornCake extends Pancake {
	
	public TornCake() {
		desc = "手抓饼";
	}
	
	@Override
	public double price() {
		return 4;
	}
}
