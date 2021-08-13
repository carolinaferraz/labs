package flowcontrol;

public class WithLabels {
	public static void main(String[] args) {
		
		System.out.println("labels w break/continue: ");
		
		System.out.println("break");

		
		alphabet: for (char letter = 'a'; letter < 'd'; letter++) {
			
			numeric: for (int number=0; number<3; number++) {
				if(number == 2) {
					
					break alphabet;
				} 
				System.out.println(letter + " - " + number);
			}
		}
		
/*		works like original break sttmt from 
 * 	 	the BreakAndContinue class 
 */
		System.out.println();
		System.out.println("continue");
		
		alpha: for (char letter = 'a'; letter < 'd'; letter++) {
			
			num: for (int number=0; number<3; number++) {
				if(number == 2) {
					
					continue alpha;
				} 
				System.out.println(letter + " - " + number);
			}
		}
	}
}
