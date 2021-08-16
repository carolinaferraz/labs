//tiny pro lab

package methods;

public class MethodDeclaration {
	public static void main (String[] args) {
//		create class instance
		MethodDeclaration md = new MethodDeclaration();
		
//		call method here
		md.talk();
	}
//	create method here
	
	public void talk() {
		System.out.println("inside the talk method");
	}
}
