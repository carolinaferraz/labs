package operators;

public class Unary {
	public static void main (String[] args) {
		
		int post = 10;
		System.out.println("post = " + post); // 10
		System.out.println("post++ = " + post++);	 
//	 	adds 1 to new value but prints old one !
		
		System.out.println("new post = " + post); //  prints new value -- 11
		System.out.println();
		
		
		int pre = 10;
		System.out.println("pre = " + pre ); // 10
		System.out.println(" ++pre = " + ++pre);	 
// 		adds & prints 11 at the same time 
		
	}
}