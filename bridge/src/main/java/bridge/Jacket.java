package bridge;

/**
 * concrete Implementor可以考虑使用抽象工厂进行设计
 * Create by lixinglin on 2018/8/22.
 * At 21:23
 */
public class Jacket extends Clothing {
	@Override
	public void dressClothes(Person person) {
		System.out.println(person.getType() + "穿了一个马甲");
	}
}
