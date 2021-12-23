package net.rev.w02;

public class Happy {

	public static void main(String[] args) {
		
		int n = 203;
		int result = n;
		
/* "any happy number will have a 1 in its sequence, 
 * and every unhappy number will have a 4 in its sequence. "
 */
		while (result !=1 && result !=4) {
			result = happy(result);
			}
		
		if (result == 1) {
			System.out.println("true");
			} else if (result == 4) {
			System.out.println("false");
			}
		}
	
	static int happy(int n) {
		int remainder = 0;
		int sum = 0;
		
//		sum of squares of digits
		while (n > 0) {
			remainder = n % 10;
			sum = sum + (remainder*remainder);
			n = n/10;
		}
		return sum;
		}
}
