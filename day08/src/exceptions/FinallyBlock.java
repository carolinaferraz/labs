package exceptions;

public class FinallyBlock {
	public static void main(String[] args) {
		
		try {
			recursive(1);
			
		} catch (StackOverflowError e){
			e.printStackTrace();
			
// 'exit' prevents the finally block from running. not best practice.
			System.exit(0);
			
		} finally {
			System.out.println("finally block ran! \ud83d\udeab ");
			System.out.println("finally block ran! \ud83d\udeab ");
			System.out.println("finally block ran! \ud83d\udeab ");
		}
	}
	
//	infinite loop for demo
	public static void recursive(int a) {
		recursive(++a);
	}
}