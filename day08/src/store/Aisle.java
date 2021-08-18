package store;

public class Aisle {
	String aisleName;
	Aisle next;
	Aisle prev;	
	Aisle[] connections;
//	Product[] products;
	
	public Aisle(String aisleName, Aisle next, Aisle prev) {
		this.aisleName = aisleName;
		this.next = next;
		this.prev = prev;
//		this.products = products;
	}
	
	public Aisle getConnectedAisle(String direction) {
		if (direction == "north")
			return connections[0];
		
		return this;
	}
	
	public Aisle moveForward () {
		return this.next;
	}
	public Aisle moveBackward() {
		return this.prev;
	}
	
	public void setNext(Aisle next) {
		this.next = next;
	}
	public void setPrev(Aisle prev) {
		this.prev = prev;
	}

}
