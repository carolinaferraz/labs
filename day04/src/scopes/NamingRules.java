package scopes;

public class NamingRules {
	
/*	 cannot have the same name as non-static:  */
//		public static double number; 
	
		public int number;
		
		
		public void setNumber(int num) {
			this.number = num;
		} 
	
/* methods and block vars */
	public void nonStaticMethod(String word) {
		
/* ok to share name w/ NamingRules, it's a diff thing
	 * because of its scope. it's an ex of variable shadowing; there's an
	 * assignment :
 */
		int number = 0;
		
		
/* this 'this' keyword can be used to distinguish between
 * method scope and instance scope vars by
 * examining the vars that exists at the object level
 */
		
		this.number = 100;
		

		
	} 
}
