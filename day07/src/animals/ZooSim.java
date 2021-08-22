// simulator for animal package

package animals;

public class ZooSim {
	public static void main(String[] args) {
		
		Lion l = new Lion("larry", 2, 90.5, "lionStr");
		System.out.println(l);
		l.eat("a hunter \ud83d\ude0b \n");
		
		
		Duck d = new Duck("donald", 89, 2.5);
		System.out.println(d.name + " duck \ud83d\udc24");
		tryToSwim(d);
		System.out.println();
		

		Platypus p = new Platypus("perry", 5, 25.0);
//		System.out.println(p.name + " the platypus");
//		p.eat("shrimps \ud83c\udf64");
		printAnimalFunFact(p);
//		printAnimalFunFact(l);
		
//		p.envenmon();
		 
		/* creating a new animal - alt syntax (see line 16): */
//		Animal anim = new Platypus("patrick", 2, 20.0);
//		((Platypus)anim).envenmon();
	}
	
//	polymorphism: 
/*	using (Animal anim) then redirect to each animal's funFact(); */
	public static void printAnimalFunFact(Animal anim) {
		anim.funFact();
		
			if(anim instanceof Platypus) {	
		/*	line 29 could be called below because Platypus *extends* Animal, allowing covariants */
				System.out.println(" \u2192 envenmon(); called from printAnimalFunFact :  ");
		((Platypus)anim).envenmon();
		
		} else if (anim instanceof Lion) {
			System.out.print("lionInt here: " + ((Lion)anim). lionInt);
		
		} if (anim instanceof Swimmable) {
			((Swimmable)anim).swim();
		}
			
			
		System.out.println();
	}	
	
//	using interfaces 
	public static void tryToSwim(Swimmable swimmer) {
		swimmer.swim();
		System.out.println("hello from tryToSwim(); \ud83d\udca6 ");
	}
}