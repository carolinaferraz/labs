//	responsible for loading rooms into memory

package game;

import fixtures.Room;

public class RoomManager {
	
	Room startingRoom;
	Room[] rooms = new Room[3];
		
/* the init() method: instantiates all Room objects,  
 * links them together as exits, 
 *  and designates a startingRoom.*/	
	
	public void init() {
		
	Room foyer = new Room(
		"the Foyer \n",
		"a small foyer \n",
		"foyer long description.");
			this.rooms[0] = foyer;
	        this.startingRoom = foyer;
	        
	        
	Room livingroom = new Room(
	    	"the living room  \n",			
	    	"livingroom shortDescription \n",
	    	"livingroom longDescription. ");
	    	this.rooms[1] = livingroom;
	    			
	Room kitchen = new Room(
	    	    "the kitchen \n",
			"kitchen shortDescription \n",
	    	    	"kitchen longDescription. \n");
	    	    	this.rooms[2] = kitchen;
	    	    			
//	   Room backyard = new Room(
//	    	    	   "the backyard \n",
//	    	    	   "backyard shortDescription \n",
//	    	    	    "backyard longDescription");
//	    	    	this.rooms[3] = backyard;
	    	    			
	    	    			
/*	adjacent rooms */
	    	    			
	 foyer.setNext(livingroom);
	 foyer.setPrev(null);
	    	    			
	livingroom.setNext(kitchen);
	livingroom.setPrev(foyer);
	kitchen.setNext(null);
	kitchen.setPrev(livingroom);
	    	    			  
	}	
}