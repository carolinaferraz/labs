package collections;

public class StacksSim {
	public static void main(String[] args) {
		Stacks stack = new Stacks();
		
		
/*  adding two values to the stack and them popping them off. 
 */
		stack.push(1);
		stack.push(2);
		int value = stack.pop();
		System.out.println(value);
		System.out.println(value);
	}

}
