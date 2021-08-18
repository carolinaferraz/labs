// super class to explore inheritance concepts. 

package animals;

public abstract class Animal {
	public String name;
	public Tag tag;
	public int age;
	public double weight;
	
//	no args constructor
//	public Animal() {
//		System.out.println("animal no-args constr called");
//	}
	
	
//	constructor
	public Animal(String name, int age, double weight) {
//		System.out.println("parameterized constructor called !");
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
/*	abstract method below has 
	the same idea as in the class; allows for each
	instance to implement its code separately w/  same call :) 
*/	
	public abstract void funFact();
		
}