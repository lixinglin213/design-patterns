package proxy.statical;

/**
 * Create by lixinglin on 2018/9/21.
 * At 8:56
 */
public class Client {
	public static void main(String[] args) {
		IUserService userService = new UserServiceProxy(new UserServiceImpl());
		userService.getAge("lixl");
	}
}
