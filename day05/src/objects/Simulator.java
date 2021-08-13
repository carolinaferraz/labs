package objects;

import animals.Cat;

public class Simulator {
	public static void main (String[] args) {
		Dog d = new Dog("pierre", "dalmatian", 1, 60.0);
		
		Dog nina = new Dog("nina", 2);
		nina.popFields("nina", "bulldog", 1, 40.5);
		
		System.out.println(d + " - " + d.name);
		
//		System.out.println(nina + " - " + nina.breed); //"bulldog" if popfields is used
		
		System.out.println(nina.name);
		System.out.println(nina.breed);
		System.out.println(nina.age);
		System.out.println(nina.weight);
		
/*using a different package - must include an import sttmt
 * or fully qualified class name (fqcn) 
*/	
		Cat c = new Cat();
		
// fully qualified class name (fqcn) w/out import
		animals.Shark s = new animals.Shark();

		}
}