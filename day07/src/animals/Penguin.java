package animals;

public class Penguin extends Bird implements Swimmable {
	public Penguin (String name, int age, double weight) {
		super(name, age, weight);
	}


	public void funFact() {
		System.out.println("penguin fun fact here " + "\ud83d\udc27");
	}

	@Override
	public void swim() {	
	}
	@Override
	public void layEggs() {
	}
}