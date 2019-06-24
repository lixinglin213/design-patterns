package singleton;

/**
 * 枚举实现单例模式
 *
 * @since 1.5
 */
public enum Singleton7 {
	//
	INSTANCE;
	private Bean bean;
	private Singleton7() {
		bean = new Bean();
	}
	public Bean getBean() {
		return bean;
	}
	
	private static class test{
		public static void main(String[] args) {
			Bean bean1 =  Singleton7.INSTANCE.getBean();
			Bean bean2 =  Singleton7.INSTANCE.getBean();
			System.out.println(bean1 == bean2);
		}
	}
	
}
