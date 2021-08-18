// exploring functional interfaces and lambda expressions

package functional;

// 	a functional intf is an intf that only has a single
//		abstract method!

@FunctionalInterface
public interface HelloWorldInterface {
	public void sayHello();
	
/*	implementing a method body in an intf
	requires use of 'default' keyword.
	
	here it allows for definition of a method body in an
	interface.
	
	NOTE: the default keyword is not typically used on intf !
	*/
	public default void sayGoodbye() {
		System.out.println("bye!");
	}

}
