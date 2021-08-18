package animals;

public class Penguin extends Animal {
	public Penguin(String name, int age, double weight) {
		super(name, age, weight);
	}

	@Override
	public void funFact() {
		System.out.println("penguin fun fact here " + "\ud83d\udc27");
	}
}