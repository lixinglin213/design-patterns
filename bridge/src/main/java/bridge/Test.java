package bridge;

/**
 * Create by lixinglin on 2018/8/22.
 * At 21:25
 */
public class Test {
	public static void main(String[] args) {
		Person person = new Women();
		Clothing clothing = new Jacket();
		clothing.dressClothes(person);
	}
}
