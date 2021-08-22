// exploring functional interfaces and lambda expressions
// 	a functional interface is an interface that only has a single abstract method 

package functional;

@FunctionalInterface
public interface HelloWorldInterface {
	public void sayHello();
	
	public default void sayGoodbye() {
		System.out.println("bye!");
	}
}