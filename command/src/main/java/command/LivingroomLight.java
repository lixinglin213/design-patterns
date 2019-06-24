package command;

public class LivingroomLight extends Light {
	
	@Override
	public void on() {
		System.out.print("客厅灯亮了");
	}
	
	@Override
	public void off() {
		System.out.print("客厅等关了");
	}
}
