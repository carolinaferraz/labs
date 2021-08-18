/* 		This is where the game-loop
 * display a prompt,  input collection,  and parsing go
*/

package game;

// collect input w/ scanner
import java.util.Scanner;

import fixtures.Room;


public class Main {
	
	public static void main(String[] args) {
		
		 boolean quit = false;
		 
		RoomManager rm = new RoomManager();
		rm.init();
		
		Player p1 = new Player();
		
		 
		System.out.println("welcome to the home tour. \n you're in  ");
		

//		call printRoom
//		printRoom();
		
		
		System.out.println();
		System.out.println("where to next?  type 'go north' or 'go west'");
		Scanner scanner = new Scanner(System. in);
	    

	   
	    
	    do { 
	    		String direction = scanner. nextLine();
	    		
	    		 if(direction.equals("go north")) {
	    		    	System.out.println("you went to the " + (rm.rooms[0]));
	    		    } else {
	    		    	System.out.println("invalid direction...  ");
	    		    }
	    
	    } 
	      while (quit != true);
		   scanner.close();
	}


    
	private static void printRoom (Player player) {
		
	}

}