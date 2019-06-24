package bridge;

/**
 * Create by lixinglin on 2018/8/22.
 * At 21:22
 */
public class Men extends Person {
	public Men() {
		setType("男人");
	}
	
	@Override
	public void dress() {
		Clothing clothing = getClothing();
		clothing.dressClothes(this);
	}
}
