package factory.method;

public class Apple implements Fruits {
	
	public Apple() {
		System.out.print("Apple");
	}
	
	@Override
	public void squeezeJuice() {
		System.out.print("榨出了苹果汁");
	}
}
