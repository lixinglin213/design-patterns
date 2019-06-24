package singleton;

import java.lang.reflect.Constructor;

/**
 * 饿汉式单例保证唯一的对象存在
 * 场景：使用在创建对象开销不是很大的情况下，创建和运行方面的负担不是很重
 */
public class Singleton3 {
	private static Singleton3 singleton3 = new Singleton3();
	
	private static Singleton3 getInstance() {
		return singleton3;
	}
	
	/**
	 * 反射破坏单例
	 *
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		Singleton3 s1 = Singleton3.getInstance();
		
		Constructor<Singleton3> constructor = Singleton3.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		Singleton3 s2 = constructor.newInstance();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
	
	
	/**
	 * 全局静态变量计数来防止反射调用破坏单例
	 * 防止反射破坏
	 *
	 * @return
	 */
	private static class Singleton {
		
		private static int count = 0;
		private static Singleton singleton = null;
		
		private Singleton() {
			synchronized (Singleton.class) {
				if (count > 0) {
					throw new RuntimeException("创建了两个实例");
				}
				count++;
			}
		}
		public static Singleton getInstance() {
			if (null == singleton) {
				singleton = new Singleton();
			}
			return singleton;
		}
		
	}
}
