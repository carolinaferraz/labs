// super class to explore inheritance concepts. 

package animals;

public abstract class Animal {
	public String name;
	public Tag tag;
	public int age;
	public double weight;
	
	public Animal() {
		System.out.println("animal no-args constructor called !");
	}
	
	public Animal(String name, int age, double weight) {
		System.out.println("parameterized constructor called !");
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
//	abstract method below has 
//	the same idea as in the class :) 
	
	public abstract void funFact();
		
}