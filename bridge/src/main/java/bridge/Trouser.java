package bridge;

/**
 * Create by lixinglin on 2018/8/22.
 * At 21:24
 */
public class Trouser extends Clothing {
	@Override
	public void dressClothes(Person person) {
		System.out.println(person.getType() + "穿了一个裤子");
	}
}
