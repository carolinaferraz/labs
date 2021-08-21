// lab on types of access
// 	: encap.one\Parent.java has the variables


package encap.two;

/* 	↓ allows sharing of public string (nothing else) */
import encap.one.Parent;


public class SimulatorTwo {
	public static void main(String[] args) {
		Parent p = new Parent();
		
		System.out.println(p.pub);
		
				
		// ↓ error-not visible ↓
//		System.out.println(p.pro); 
//		System.out.println(p.def); 
//		System.out.println(p.pri); 
		}
}
