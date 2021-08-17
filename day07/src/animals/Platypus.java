package animals;

public class Platypus  extends Animal {

/*	this constructor is built by going to "source" > 
 * "generate constructor from superclass. 
	*/
	public Platypus(String name, int age, double weight) {
		super(name, age, weight);
		// TODO Auto-generated constructor stub
	}
	
	public void funFact() {
		System.out.println("platypus fun fact here");
	}
	
	public void envenmon() {
		System.out.println("platypi are poisonous!");
	}
	
}
