package command;

public class Test {
	public static void main(String[] args) {
		
		RemotControl remotControl = new RemotControl();
		Light light = new BedroomLight();
		
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		
		remotControl.setCommand(lightOnCommand);
		remotControl.buttonPressed();
		
		Door door = new DoorInnerCommand();
		DoorOpenCommand doorOpenCommand = new DoorOpenCommand(door);
		
		remotControl.setCommand(doorOpenCommand);
		remotControl.buttonPressed();
	}
}
