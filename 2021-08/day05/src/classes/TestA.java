//	tiny pro lab Static vs Instance Class Members
//	related TestB.java

package classes;

public class TestA {
//	static member
	public static int staticCount = 0;
	
//	instance member
	public int instanceCount = 0;
	
//	no-arg constructor to update values +1:
	public TestA() {
		staticCount++;
		this.instanceCount++;
	}
	
}
