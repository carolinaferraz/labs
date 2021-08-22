// super class to explore inheritance concepts. 

package animals;

public abstract class Animal {
	public String name;
	public Tag tag;
	public int age;
	public double weight;		
	
	public abstract void funFact();

	public Animal() {
		System.out.println("hello from no-args Animal constructor.");
	}

public Animal (String name, int age, double weight) {
	this.name = name;
	this.age=age;
	this.weight=weight;
	
	System.out.println("hello from Animal constructor");
	}

public void eat(String food) {
	System.out.println("the animal is eating " + food);
	}
}