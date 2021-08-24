package animals;

public class Platypus  extends Animal {

	public Platypus(String name, int age, double weight) {
		super(name, age, weight);

		System.out.println("hello from platypus constructor");		
	}
	
	public void funFact() {
		System.out.println("platypus fun fact here");
	}
	
	public void envenmon() {
		System.out.println("platypi are poisonous \ud83d\udc80");
	}
}