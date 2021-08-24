package methods;

public class MethodsBasics {

	public static void main(String[] args) {
		
		int sum = addFiveToInt(20);
		System.out.println(sum);

	}
	
/*			parameter - placeholder var declared and used when 
 * 		defining a method
 * 
 *  		argument - info supplied to app by user when invoking
 *  	a method. it should match the datatype of the parameter
 */
	
		public static int addFiveToInt(int input) {
			return input + 5;
		}
}