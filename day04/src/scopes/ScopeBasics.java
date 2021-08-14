package scopes;

/*
 * scopes indicate isolated levels in our program which dictate
 * where and for how long we have access to certain variables.
 * vars which are created within a particular scope are lost
 * the moment we leave the scope
 * 
 * 4 levels of scope:
 * 
 * static/class - vars that exist throughout the entire life of the program
 * instance/object - vars that exist while an object exists and is 
 * 		accessible through a reference var pointing to that object.
 * method - vars that are created within a method and are lost once
 * 		the context has finished running. this includes method's params
 * block - vars that are created within flow control sttmts within a
 * 		method. note that flow control sttmts must
 * 		be used within the body of a method! 
 */

public class ScopeBasics {
//	static / class var
	public static String stcWord;
	
//	instance var
	public String objWord;
	
//	method var
	
	/*
	 * nonStaticmethod can't be invoked from a static one (like
	 * 	main, for instance. there has to be an object created 1st.
	 * 		see lines 56-57 
	 */
	public void nonStaticmethod(String mtdWord) {
		mtdWord = "changed within method";
		
		if (true) {
			String blockWord = "within if-statement";
			System.out.println(blockWord);
		} // System.out.println(blockWord);  --> out of scope! 
		
//		for (int i =0; i<10;i++) {
//			System.out.println(i);
//			
//		} 		// System.out.println(i);  --> out of scope! 
	}
	
	/*
	 * static keyword is commonly used w/ 
	 * 		integers keeping track of counts
	 */
	
	public static void main(String[] args) {
		String mainMethodWord = "main method word";
		
		ScopeBasics sb = new ScopeBasics();	
		sb.nonStaticmethod("argument");
		}
}
