package flowcontrol;

public class WhileLoops {
	public static void main(String[] args) {
		
		System.out.println("app begins");
		
		System.out.println("while loop: ");
//		while -- will only execute is condition is true 
		int x = 0;
		while ( x < 3) {
			System.out.println(x++);
		}
		
		System.out.println();
		System.out.println("do-while loop: ");
		
//		do-while -- will execute at least one time even if cond is f
		int y = 70;
		do {
			System.out.println(y);
			y++; 		// same as     y = y + 1;
		} while ( y < 3);

		System.out.println("app ends");
	}
}