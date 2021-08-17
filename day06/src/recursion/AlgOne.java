/* tiny lab - create a recursive algorithm for 
 * calculating the factorial of a number 
 */

package recursion;

public class AlgOne {
	public static void main(String[] args) {
//		some dummy data for method
		int input = 5;
		
		AlgOne ao = new AlgOne();
		
//		method call
		System.out.println(ao.factorial(input));
	}
	
//	1st method here:

	public int factorial(int num) {
		if (num <= 0) return 0;
		if (num == 1) return 1;
		
		return num * factorial(num-1);
	}
}
