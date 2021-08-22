package animals;

public class Bat extends Animal implements Flyable {
	public Bat(String name, int age, double weight) {
		super(name, age, weight);
	}
	
	@Override
	public void fly() {	
	}

	@Override
	public void funFact() {
	}

}
