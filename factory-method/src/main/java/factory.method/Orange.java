package factory.method;

public class Orange implements Fruits {
	public Orange() {
		System.out.print("orange");
	}
	
	@Override
	public void squeezeJuice() {
		System.out.print("榨出了橘子汁");
	}
}
