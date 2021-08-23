package game;

public class Main {


	public static void main(String[] args) {
		
		RoomManager rm = new RoomManager();
		rm.init();
		
		Player p1 = new Player();
		p1.setCurrentRoom(rm.startingRoom);
		p1.getCurrentRoom();
		
		System.out.println("commands: north n , south s , quit q \n");
		
		printRoom(p1);
		Input.collectInput();
//		collectInput();
		walkAround(p1);
		
	}

	private static void printRoom(Player p1) {
		System.out.println("you're here: " + p1.currentRoom);
	}

	public static void walkAround(Player p1) {
		String input = " ";
		
	 			if (input.equalsIgnoreCase("n"));{
	 				p1.setCurrentRoom(p1.getCurrentRoom().getNext());
	 				printRoom(p1);	
	 			}
	 			  if (input.equalsIgnoreCase("s")); {
	 				p1.setCurrentRoom(p1.getCurrentRoom().getPrev());
	 				printRoom(p1);
	 			} 
	 			  if (input.equalsIgnoreCase("q")); {
	 				  System.out.println("end of tour ");
	 				  
	 			  } 
		} 
	} 