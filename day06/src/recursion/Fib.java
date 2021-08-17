// tiny lab Writing a Factorial Method using Recursion
// related file: TestFib.java

package recursion;

public class Fib {
	public int fibonacci(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		return fibonacci(n-1) + fibonacci(n-2);
	}
}
