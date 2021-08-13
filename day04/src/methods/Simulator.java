package methods;

/* my role is to have a main method, that is it.
 * this is common/best practice!
 */

public class Simulator {
	public static void main(String[] args) {
		
//		obj needs to be created because the Dog class is not static 
		
		Dog scooby = new Dog();
		
//		invoking methods from Dog.java
		scooby.bark();
		scooby.feed();
		scooby.feed("scooby snack");
	}
}