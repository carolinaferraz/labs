//	responsible for loading rooms into memory

package game;

import fixtures.Room;

public class RoomManager {
	
	Room startingRoom;
	Room[] rooms = new Room[5];
	
	
/* the init() method: instantiates all Room objects,  links them together as exits, 
 *  and designates a startingRoom.*/	
	public void init() {
		
	Room foyer = new Room(
		"the Foyer \n",
		"a small foyer \n",
		"foyer long description. foyer long description.  \n"
			
		+ "If you 'go north', you'll reach the living room \n"
		+ "('quit' takes you back outside!) ");
			this.rooms[0] = foyer;
	        this.startingRoom = foyer;
	        
	        
//	 duplicated kitchen in order to to populate a different exit
	  Room shadowkitchen = new Room(
		"the kitchen \n",
		 "kitchen shortDescription \n", 			
		 "kitchen longDescription. \n"
		 
		+ "the backyard looks inviting, 'go out' ? type 'head east' to stay in.");
		    	this.rooms[4] = shadowkitchen;
	        
	Room livingroom = new Room(
	    	"the living room  \n",			
	    	"livingroom shortDescription \n",
	    	"livingroom longDescription.\n "
	    	
	    	+ "'Go west' to the kitchen, or 'head south' and back to the foyer.");
	    	this.rooms[1] = livingroom;
	    			
	    			
	Room kitchen = new Room(
	    	    "the kitchen \n",
			"kitchen shortDescription \n",
	    	    	"kitchen longDescription. \n"
	    	    			
	    	    	+ "the backyard looks inviting, 'go out' ? \n"
	    	    	+ "type 'head east' to stay inside.");
	    	    	this.rooms[2] = kitchen;
	    	    			
	   Room backyard = new Room(
	    	    	   "the backyard \n",
	    	    	   "backyard shortDescription \n",
	    	    	    "backyard longDescription. \n"
	    	    	    			
	    	    	   	+ "enjoy the nice day! \ud83d\ude0e \n"
	    	    	   	+ "'quit' or 'go' back.");
	    	    	this.rooms[3] = backyard;
	    	    			
	    	    			
//	adjacent rooms
	    	    			
	    	    	
	 foyer.setNext(livingroom);
	 foyer.setPrev(null);
	    	    			
	livingroom.setNext(kitchen);
	livingroom.setPrev(foyer);
	backyard.setNext(shadowkitchen);
	backyard.setPrev(kitchen);
	kitchen.setNext(backyard);
	kitchen.setPrev(livingroom);
	    	    			  
	}	
}