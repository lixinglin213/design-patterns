package command;

public class DoorOpenCommand implements Command {
	
	Door door;
	
	public DoorOpenCommand(Door door) {
		this.door = door;
	}
	
	@Override
	public void execute() {
		door.open();
	}
}
