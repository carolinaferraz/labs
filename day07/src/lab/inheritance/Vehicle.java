// pro lab 

package lab.inheritance;

public class Vehicle {
	private String name;
	private long serialNumber;
	
	//		getters and setters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(long serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public void move() {
		System.out.println("vehicle is moving... ");
	}
	
	public void move(int spaces) {
		System.out.println("vehicle modes " + spaces+ " spaces");
	}
	
}
