package singleton;

import java.io.*;

/**
 * @Since 1.5
 */
public class Singleton5 implements Serializable {
	//volatile保证当instance变量被初始化成Singleton实例时，多个线程可以正确处理singleton5变量
	
	private volatile static Singleton5 singleton5;
	
	private Singleton5() {
	}
	
	/**
	 * 双重锁保证单例，提高性能
	 */
	public static Singleton5 getInstance() {
		//只有第一次执行才会执行这里的代码
		if (null == singleton5) {
			synchronized (Singleton5.class) {
				if (null == singleton5) {
					singleton5 = new Singleton5();
				}
			}
		}
		return singleton5;
	}
	
	/**
	 * 不止反射，序列化和反序列化也可以破坏单例
	 * 代码的内部实现也是因为序列化会通过反射调用无参数的构造方法创建一个新的对象
	 * ObjectInputStream.readOrdinaryObject()片段desc.newInstance)
	 *
	 * @param args
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tempFile"));
		oos.writeObject(Singleton5.getInstance());
		//Read Obj from file
		File file = new File("tempFile");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		Singleton5 newInstance = (Singleton5) ois.readObject();
		//判断是否是同一个对象
		System.out.println(newInstance == Singleton5.getInstance());
	}
	
	/**
	 * 增加这个方法可以防止序列化对于单例的破坏
	 *
	 * @return
	 */
	private Object readResolve() {
		return singleton5;
	}
	
}
