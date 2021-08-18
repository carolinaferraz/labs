// exploring functional interfaces and lambda expressions

package functional;

public class Simulator {
	
	public static void main(String[] args) {
		HelloWorldInterface hwi = new HelloWorldClass();
		hwi.sayHello();
		
		
//		lambda here
		HelloWorldInterface throwAway = () -> {
			System.out.println("hello from lambda !");
		};
		throwAway.sayHello();
		
		/* FIX BELOW ALONG W THE INTERFACE FILE 
		 * CODE MISSING 
		 * */
		
//		PrintInputInterface pi = (String input) -> {
//			System.out.println("input: " + input);
//		
//		};
//		pi.printInput("hello from printInput");
	}

}
