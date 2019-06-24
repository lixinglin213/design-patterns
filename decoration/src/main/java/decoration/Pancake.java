package decoration;

/**
 * Create by lixinglin on 2018/8/7.
 * At 8:45
 */
public abstract class Pancake {
	
	public String desc = "抽象的煎饼父类";
	
	public String getDesc() {
		return desc;
	}
	
	public abstract double price();
}
