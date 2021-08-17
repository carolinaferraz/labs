//tiny pro lab Static vs Instance Class Members

package classes;

public class TestB {
	public static void main(String[] args) {
		
		TestA a = new TestA();
		
		System.out.println("a.instanceCount: " + a.instanceCount); // 1
		System.out.println("TestA.staticCount: " + TestA.staticCount); // 1
		System.out.println();
		
//		new instance of TestA() :
		TestA a2 = new TestA();
		
		System.out.println("a2.instanceCount " + a2.instanceCount); // 1
		System.out.println("TestA.staticCount updated to: " + TestA.staticCount + "  ! "); // 2 !
		System.out.println();
		
//		reassigning the value of a does not affect a2.
		a.instanceCount = 15;
		
		System.out.println("object 'a' instanceCount: " + a.instanceCount);
		System.out.println("object 'a2' instanceCount: " + a2.instanceCount);
		System.out.println();
		
		System.out.println("unchanged class TestA stactiCount: " + TestA.staticCount );
	}
}
