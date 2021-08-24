package lab.inheritance;

public class Airplane extends FlyingVehicle{
	private short wheels;
	private short propellers;
	public short getWheels() {
		return wheels;
	}
	public void setWheels(short wheels) {
		this.wheels = wheels;
	}
	public short getPropellers() {
		return propellers;
	}
	public void setPropellers(short propellers) {
		this.propellers = propellers;
	}
	
	public void turn() {
		System.out.println("turning...");
	}

}
