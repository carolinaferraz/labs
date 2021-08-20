package fixtures;


public class Room extends Fixture {
	Room next;
	Room prev;
	Room[] exits;


// 	constructor w 2 exits
	
	public Room(String name, String shortDescription, 
			String longDescription) {
		super(name, shortDescription, longDescription);
		
		this.exits = new Room[2];
	}
	

	public Room getNext() {
		return next;
	}
	
	public Room getPrev() {
		return prev;
	}

	public void setNext(Room next) {
		this.next = next;
	}
	public void setPrev(Room prev) {
		this.prev = prev;
	}


	public Room[] getExits() {
		return exits;
	}

	public void setExits(Room[] exits) {
		this.exits = exits;
	}

	
}
