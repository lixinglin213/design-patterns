package facade;

/**
 * 这是一个一键开启卧室和起居室灯的类
 * Create by lixinglin on 2018/8/7.
 * At 21:08
 */
public class LightFacade {
	
	private LivingBulb livingBulb;
	
	private RoomBulb roomBulb;
	
	public void autoLightOn() {
		livingBulb = new LivingBulb();
		roomBulb = new RoomBulb();
		livingBulb.lightOn();
		roomBulb.lightOn();
	}
}
