// tiny pro lab

package methods;

public class ReturnTypes {
	public static void main(String[] args) {
//		create class instance
		ReturnTypes rt = new ReturnTypes();
		
		
//		 call methods
		rt.returnNothing();
		boolean b = rt.returnBoolean();
		
		System.out.println("the value of b is: " + b);
	}

/*	 first method doesn't return any data. 
	It has a *void*  return type.
	*/
	public void returnNothing() {
		System.out.println("inside of a void method");
	}
	
//	method w/ return
public boolean returnBoolean() {
	return true;
}
 }
