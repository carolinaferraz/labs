// responsible for "loading" our rooms into memory.

package game;

import fixtures.Room;

public class RoomManager {

	Room startingRoom;
	
//	all rooms in the house:
	Room[] rooms = new Room[3];
	
	public void init() {
	    Room foyer = new Room(
			"The Foyer",
			"a small foyer",
			"The small entryway of a neo-colonial house. A dining room is open to the south, where a large table can be seen." + "\n"
			+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor." + "\n"
			+ "To the north is a dining room.");
			this.rooms[0] = foyer;
	        this.startingRoom = foyer;
	        
	    
	        Room diningroom = new Room(
	    			"The Dining Room",
	    			"short description of dining room",
	    			"long description of dining room. long description of dining room. "
	    			+ "long description of dining room. long description of dining room. "
	    					
	    			+ "you can go east to the kitchen or south back to the foyer");
	    			this.rooms[1] = diningroom;
	    			
	    			
	    			Room kitchen = new Room(
	    	    			"The Kitchen",
	    	    			"short description of kitchen",
	    	    			"long description of kitchen. long description of kitchen. "
	    	    			+ "long description of kitchen. long description of kitchen. "
	    	    					
	    	    			+ "you can go west to the dining room or south back to the foyer");
	    	    			this.rooms[2] = kitchen;
	}
}
