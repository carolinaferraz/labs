package game;

import java.util.Scanner;

public class Input {
	
	public static String collectInput() {
	Scanner sc = new Scanner(System.in);
		String input = " ";
		
	    while (input !=  null) {
	    	System.out.print(">> ");
	    	input = sc.nextLine();
	    	System.out.println("returning input: " + input);
	    	
	    			if (input.equalsIgnoreCase("q")) {
					System.out.println("bye!"); 
	    			sc.close(); 						    	
	    			break; 
	    			}
 
	    } return input; 
	}
}	
