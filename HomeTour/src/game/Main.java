package game;

import java.util.Scanner;

public class Main {
	

	static Scanner sc = new Scanner(System.in);


	public static void main(String[] args) {
		RoomManager rm = new RoomManager();
		rm.init();
		
		Player p1 = new Player();
		p1.setCurrentRoom(rm.startingRoom);
		p1.getCurrentRoom();
		
		System.out.println("\ud83c\udfe1"
				+ " Welcome to the Home Tour! \n"
				+ "You can visit some rooms and look around \n "
				+ "by typing in the commands shown in 'quotation marks'. \n");
		
		printRoom(p1);
		collectInput();
		walkAround(p1);

	}

	private static void printRoom(Player p1) {
		System.out.println("\ud83d\udeaa You're in " + p1.currentRoom);
	}
	
	public static String collectInput() {
		
		String input = null;
		
		do {
			System.out.print(">> ");
			input = sc.nextLine(); 

				if(input.equalsIgnoreCase("quit") ) {
					System.out.println("end of tour!");
					return null;
				
				} else return input.toLowerCase(); 
					
		} while (! input.equalsIgnoreCase("quit"));	
	}
	
	public static void walkAround(Player p1) {
		String where = sc.nextLine();
		
		do {
	 			if (where.contains("go")); {
	 				p1.setCurrentRoom(p1.getCurrentRoom().getNext());
	 				printRoom(p1);
	 				
	 				System.out.print(">> ");
	 				where = sc.nextLine();	 				
	 			
	 			}  if (where.contains("head")) {
	 				p1.setCurrentRoom(p1.getCurrentRoom().getPrev());
	 				printRoom(p1);
	 				
	 				System.out.print(">> ");
	 				sc.nextLine();
	 				
	 			
	 			} if(where.equalsIgnoreCase("quit") ) {
					System.out.println("end of tour!"); }

					
	 	} while (! where.equalsIgnoreCase("quit"));
	}
}