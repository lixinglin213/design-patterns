package bridge;

/**
 * Create by lixinglin on 2018/8/22.
 * At 21:19
 */
public class Women extends Person {
	
	public Women() {
		setType("女人");
	}
	
	@Override
	public void dress() {
		Clothing clothing = getClothing();
		clothing.dressClothes(this);
	}
}
