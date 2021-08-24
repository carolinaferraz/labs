package methods;

public class VarArgs {
	public static void main(String[] args) {
		int[] values = {100, 509, 580, 3222, 765};
		takeArray(values);
		
		takeVarArgs(values);
		
/*varargs allows java to dynamically create an 
 * array during runtime w the values declared 
on method call
*/		
		takeVarArgs(99, 77, 300);
	}
	
	public static void takeArray(int[] numbers) {
		System.out.println("takeArray method: ");
		for(int i : numbers) {
			System.out.println(i);
		}
	}
	
	public static void takeVarArgs(int... variable) {
		System.out.println();
		System.out.println("takeVarArgs method: ");
		
		for (int i : variable) {
			System.out.println(i);
		}
	}  
}
