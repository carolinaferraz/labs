package animals;

public abstract class Bird extends Animal {

	public Bird(String name, int age, double weight) {
		super(name, age, weight);
	}
	
//	not true about  all birds. solved by creating 'flyable' interface -> moved there <- 
//	public abstract void fly(); 
	
//	true abt all birds
	public abstract void layEggs();

}
