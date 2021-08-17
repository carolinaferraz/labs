// simulator for animal package

package animals;

public class ZooSim {
	public static void main(String[] args) {
//		Animal a = new Animal();
		
		Platypus p = new Platypus ("perry", 5, 25.0);
		Lion l = new Lion ("larry", 1, 55.0);
//		printAnimalFunFact(p);
//		printAnimalFunFact(l);
		
		Penguin penguin = new Penguin("igloo", 2, 10.0);
		printAnimalFunFact(penguin);
		
//	polymorphism in action (mixing constr.):
/* prim. var: type of primitive, value
	 * ref var: type of reference, memory address 
*/
		Animal anim = new Platypus ("patrick", 6, 20.0);
		
/*		example of covariance / covariant typing:
 * allows you to look at the child/super class info and
 * vice-versa when you have certain obj that reside within
 * a hierarchy 
 */
		
		((Platypus)anim).envenmon();
	}
	
//	look at parent info from any child: 
	public static void printAnimalFunFact(Animal anim) {
		anim.funFact();
		
		if(anim instanceof Platypus) {
			((Platypus)anim).envenmon();
	} else if (anim instanceof Lion) {
		((Lion)anim).Rawr();
	}
	
	}
}
