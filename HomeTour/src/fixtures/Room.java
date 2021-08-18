/* Room[] exits; =>  the rooms adjacent to this one. 
 * You might decide that a room in a particular
 *  direction always uses a certain index, e.g. 
 *  a north exit always goes in index 0, 
 *  an east exit always goes in index 1, etc. 
 *  If so, then the size of this array depends on 
 *  how many directions you want to support.
 * */

package fixtures;

public class Room extends Fixture {
	Room[] exits = new Room[2];
	
	public Room (String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		
		this.exits = new Room[ 2]; // room size
	}
	
	public Room[] getExits() {
		
	}
	
	public Room getExit(String direction) {
		if (direction == "go north") 
			return 
		
	}
}