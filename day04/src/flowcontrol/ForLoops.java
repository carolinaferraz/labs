package flowcontrol;

public class ForLoops {

	public static void main(String[] args) {
		// very common w data structures ←
		
		/*
		 * 					syntax:
		 * 			for (initialization; condition; modification)  {};
		 * 		initialization - similar idea to "do" in do-while. 
		 * 		condition - boolean determining repetition
		 * 		modification - usually changes var created on init
		 */
		System.out.println("app begins");
		
		for (int x =0;  x<20;  x=x+2) {
			System.out.print(x + " ");
		} 
			System.out.println(); System.out.println();

//		iterating through an array
		int[] numbers = new int[] {55,66,33,77,88};
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println();
		
		
//		looping over iterable obj w _enhanced_ for loop
		int[] loopObj = {11, 22, 77};
		for (int x : loopObj) {
			System.out.println(x);
		}
				
		System.out.println("app ends");
		}
}