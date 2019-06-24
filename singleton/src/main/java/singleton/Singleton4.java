package singleton;

/**
 * 静态内部类实现饿汉式，防止类加载的时候就会生成单例造成系统开销很大
 */
public class Singleton4 {
	
	private Singleton4(){
	}
	public Singleton4 getInstance(){
		return SingletonHolder.singleton4;
	}
	private static class SingletonHolder{
		private static final Singleton4 singleton4 = new Singleton4();
	}
	
}
