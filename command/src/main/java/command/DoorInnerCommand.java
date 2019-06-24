package command;

public class DoorInnerCommand extends Door{
	@Override
	public void open() {
		System.out.print("内门打开了");
	}
	
	@Override
	public void close() {
		System.out.print("内门关闭了");
	}
}
