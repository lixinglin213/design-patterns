package command;

public class DoorOuter extends Door {
	@Override
	public void open() {
		System.out.print("外门打开了");
	}
	
	@Override
	public void close() {
		System.out.print("外门关闭了");
	}
}
