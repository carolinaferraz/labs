//	tiny	pro lab 

package scanners;

import java.util.Scanner;

public class LabScanner {
	public static void main(String[] args) {
/* 		using the console to capture input	*/
		
//		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Please type in a line and hit Enter. >  ");
//		
//		String line = scan.nextLine();
//		System.out.println("you have typed: " + line);
		
/*		using string as input */
		String numbers = "1 2 3 4 5 9";
		Scanner scan = new Scanner(numbers);
		
		/* loop through the string to parse input */
		
		while (scan.hasNextInt()) {
		
	/* nextInt() to convert the parsed token to an int. 
	 * Although we could just use next() to grab the subsequent token, 
	 * here we'll call nextInt which will automatically convert the token 
	 * to an int as opposed to a String.		*/
			
			System.out.print(scan.nextInt());
		}
		scan.close();
	}
}