//tiny pro lab Constructors

package constructors;

public class Constructors {
	
	public Constructors() {
		System.out.println("default constructor ran.");
	}
	public Constructors (int value) {
		System.out.println(value);
	}
	
	public static void main(String[] args) {
//		instances go here
		Constructors c = new Constructors(7177);
		
//		w/ no-arg constructor
		Constructors cNoArg = new Constructors();
	}
}
