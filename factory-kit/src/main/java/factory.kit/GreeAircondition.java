package factory.kit;

import java.sql.Array;

public class GreeAircondition implements Aircondition {
	public GreeAircondition() {
		System.out.println("Gree");
	}
	
	@Override
	public void cooling() {
		System.out.println("给我降温了");
	}
}
