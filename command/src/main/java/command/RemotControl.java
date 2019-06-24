package command;

public class RemotControl {
	Command command;
	
	public RemotControl() {
	
	}
	
	public void setCommand(Command command) {
		this.command = command;
	}
	public void buttonPressed(){
		command.execute();
	}
	
}
