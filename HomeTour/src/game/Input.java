package game;

import java.util.Scanner;

public class Input {
	static Scanner sc = new Scanner(System.in);
	
 		public static String collectInput() {
 		String input = " ";

 	    	do {
 	    		System.out.print(">> ");
 	    		input = sc.nextLine();
 	    		System.out.println("returning input: " + input);
 	    	} while (!input.equalsIgnoreCase("q"));
 	    	

 	    		if (input.equalsIgnoreCase("q")) {
 	    			System.out.println("bye!");
 	    			sc.close();
 	    			
 	    		}
 	    		
 		return input; 
 	} 		
}