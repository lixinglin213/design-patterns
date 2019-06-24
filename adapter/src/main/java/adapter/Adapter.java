package adapter;

/**
 * 通过继承来获取被适配角色的职责
 * 结合适配器的缺点一定程度上不如重构（还是需要结合场景实现）
 *
 * <p>
 * Create by lixinglin on 2018/8/4.
 * At 17:29
 */
public class Adapter implements Target {
	
	private Adaptee adaptee;
	
	@Override
	public int getElec() {
		adaptee = new Adaptee();
		int elec = adaptee.getElec();
		return elec / 2;
	}
}
