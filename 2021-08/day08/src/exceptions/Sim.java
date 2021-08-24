// evennumber exception lab

package exceptions;

public class Sim {
	public static void main(String[] args) {
		
		try {
			sumOddNumbers(1,2);
		} catch (EvenNumberException e) {
			e.printStackTrace();
		} finally {
			System.out.println("this is the finally block \ud83d\udeab");
		}
	}
	
	public static int sumOddNumbers(int a, int b)
			throws EvenNumberException {
		if(a % 2 == 0)
			throw new EvenNumberException("first input was even");
		if(b % 2 == 0)
			throw new EvenNumberException("second input was even");
		
			return a + b;
	}
}