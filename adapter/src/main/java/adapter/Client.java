package adapter;

/**
 * Create by lixinglin on 2018/8/4.
 * At 17:29
 */
public class Client {
	public static void main(String[] args) {
		Target target = new Adapter();
		int elec = target.getElec();
		System.out.println(elec);
	}
}
