package flowcontrol;

public class BreakAndContinue {
	public static void main (String[] args) {
		
//		for (int i =0;  i<7;  i++) {
//			System.out.println(i);
//			
//			if(i==5) {
//				System.out.println("im 5!");
//				break;
//			}
//		}
		
		
/* 	nested loops w break and continue */
		
//		for (char letter = 'a'; letter < 'e'; letter++) {
////			System.out.println(letter);
//			
//			for (int number=0; number<4; number++) {
//				if(number == 2) {
//					break;
//				} 
//				System.out.println(letter + " - " + number);
//			}
//		}

		
		for (char letter = 'a'; letter < 'e'; letter++) {
			
			for (int number=0; number<4; number++) {
				if(number == 2) {
					continue;
//	'continue'  skips 2 and continues w/ 3 before next letter
				} 
				System.out.println(letter + " - " + number);
			}
		}
		
	}
}
