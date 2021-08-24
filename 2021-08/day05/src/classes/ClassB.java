//  tiny pro lab on CompositeRelationships
package classes;

public class ClassB {
	ClassA classA = new ClassA();
//	ClassA declared as an instance variable.
	
/*	ClassB has a composite relationship with ClassA.
 * Since ClassB has a reference to ClassA, we can use the instance 
 * of ClassB to execute accessible methods from ClassA.
	*/
	public static void main(String[] args) {
		ClassB b = new ClassB();
		b.classA.setName("hello from classA -- setName method ! ");
		
		System.out.println(b.classA.getName());
	}
}