package singleton;

/**
 * 由1的改造针对方法级别同步
 * 但是我们只需要第一次生成对象的时候同步防止生成两个一样的对象，这样操作很明显会出现很严重的性能问题
 *
 * @return
 */
public class Singleton2 {
	private static Singleton2 singleton2;
	private Singleton2() {}
	public static synchronized Singleton2 getInstance() {
		if (null == singleton2) {
			singleton2 = new Singleton2();
		}
		return singleton2;
	}
}
