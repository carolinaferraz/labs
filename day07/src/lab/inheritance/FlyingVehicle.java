package lab.inheritance;

public class FlyingVehicle extends Vehicle {
	private short wings;
	private Engine engine;
	
	
	public short getWings() {
		return wings;
	}
	public void setWings(short wings) {
		this.wings = wings;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void fly() {
		System.out.println("FlyingVehicle is flying...");
	}
	
	public void refuel() {
		System.out.println("FlyingVehicle is refueling...");
	}
	
	public void liftOff() {
		System.out.println("FlyingVehicle is lifting off...");
	}
	
	public void land() {
		System.out.println("FlyingVehicle is landing..");
	}	
}
