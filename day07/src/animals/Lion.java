package animals;

public class Lion extends Animal {

	public String lionInt;
	
	public Lion (String name, int age, double weight, String lionInt) {
		super(name, age, weight);
		
		this.lionInt = lionInt;
	}

	public Lion() {
//		super(); lives here implicitly!
	}

	@Override
	public String toString() {
		return lionInt;
	}

	public void funFact() {
		System.out.println("lion fun fact here");
	}
	
	public void Rawr() {
		System.out.println("lions roar");
	}
}