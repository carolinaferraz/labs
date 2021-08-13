package objects;

public class Dog {
	public String name;
	public String breed;
	public int age;
	public double weight;

	
	public void bark() {
		System.out.println("woof woof!");
	}
	
//	syntax for "default" (no-args) constructor:
	public Dog() { 
		
//		'this' keyword optional below (these are not listed args)
		this.name = "no name";
		this.breed = "no breed";
		this.age = 0;
		this.weight = 0.0;
	}
	
//	different syntax :
//	public Dog() { 
//		this("no name", "no breed", 0, 0.0);
//	}
	
	
//	syntax for parameterized constructor :
	public Dog(String name, String breed, int age, double weight) {
		System.out.println("Dog constructor was called");
	this.name = name;
	this.breed = breed;
	this.age = age;
	this.weight = weight;
	}
	
	
//	method overloading 
	public Dog (String name, int age) {
		this.name = name;
		this.age = age;
		
		breed = "no breed provided";
		weight = 0.0;
	}

	
/*	the method below to populate fields is for 
 * demo purposes only!
*/	
	public void popFields(String name, String breed, int age, double weight) {
		System.out.println("populating fields on Dog.");
	this.name = name;
	this.breed = breed;
	this.age = age;
	this.weight = weight;
	}

}
