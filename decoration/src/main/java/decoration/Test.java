package decoration;

/**
 * Create by lixinglin on 2018/8/7.
 * At 8:56
 */
public class Test {
	public static void main(String[] args) {
		Pancake pancake = new TornCake();
		pancake = new Ham(pancake);
		pancake = new FiredEgg(pancake);
		System.out.println(pancake.getDesc() + ",的价钱是" + pancake.price());
	}
}
