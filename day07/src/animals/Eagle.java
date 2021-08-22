package animals;

public class Eagle extends Bird implements Flyable {
	public Eagle(String name, int age, double weight) {
		super(name, age, weight);

	}

	@Override
	public void fly() { }

	@Override
	public void funFact() { }

	@Override
	public void layEggs() { }

}
