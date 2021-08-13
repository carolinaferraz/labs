package methods;

/*
 * check arrays/arrayBasics.java to see this import! 
 */

public class Dog {
	
	public String name;
	public int age;
	public String breed;

//	void = no return keyword 
	public void bark() {
		System.out.println("woof woof!");
	}
	
	public void feed() {
		System.out.println("the treat name was not provided!");
	}
	
//	overloading feed method w/ a parameter
	public void feed (String treat) {
		System.out.println("the dog is enjoying a " + treat);
	}
}
