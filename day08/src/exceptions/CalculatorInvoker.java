package exceptions;

public class CalculatorInvoker {
	public static int callCalculator (int a, int b) {
		return Calculator.divide(a,b);
	}
}
// output  w/ *double* data type  would be "infinity", not an exception