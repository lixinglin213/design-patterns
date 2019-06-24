package command;

public class BedroomLight extends Light {
	
	@Override
	public void on() {
		System.out.print("卧室灯亮了");
	}
	
	@Override
	public void off() {
		System.out.print("卧室灯关了");
	}
}
