// exploring functional interfaces and lambda expressions

package functional;

public class Simulator {
	
	public static void main(String[] args) {
		HelloWorldInterface hwi = new HelloWorldClass();
		hwi.sayHello();
	
//	lambda expr. example
		HelloWorldInterface throwAway = () -> {
			System.out.println("hello from lambda expression");
		};
		throwAway.sayHello();
		
//		another interface
		PrintInputInterface pi = (String input) -> {
			System.out.print(" your input: \ud83d\udcac  " + input);
		};	
		pi.printInput("lorem ipsum dolor sit amet \n");
			
//	implementation 2 of printInput();
	PrintInputInterface piTwo = (String input) -> {
		System.out.print(" your input 2: \ud83d\udcac  " + input);
	};	
	piTwo.printInput("lorem ipsum dolor sit amet \n");
	}
}