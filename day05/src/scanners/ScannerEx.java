package scanners;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter morning, noon or night");
		String time = scan.next();
		
		
		switch(time.toLowerCase()) {
		case "morning":
			System.out.println("good morning!");
			break;
			
		case "noon":
			System.out.println("hello there :)");
			break;
			
		case "night":
			System.out.println("good night!");
		}
	}
}
