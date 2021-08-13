package strings;

public class StringTiming {
	
	public static int n = 150_000; // 150k times
	
	public static void main(String[] args) {
		
//		StringBuilder sb = new StringBuilder("hello");
//		System.out.println(sb);
//		sb.append( " world");
//		System.out.println(sb);
//		
//		System.out.println();
//		
////		w/ String
//		String s = new String("hello ");
//		System.out.println(s);
//		String s2 = s.concat("world :) ");
//		System.out.println(s2);
		
		manyStrings();
		useStringBuilder();
		useStringBuffer();
		
		System.out.println();
		System.out.println(" > app ends here. ");
		}
	
//	timing loops & comparing efficiency
	
//	w/ String class -- concat() 
	public static void manyStrings() {
		System.out.println(" > app starts here. ");
		System.out.println();
		
		String s = new String ("a");
		
		long start = System.currentTimeMillis();
		for (int i =0; i<n; i++) {
			s = s.concat("a");
		}
		
		long end = System.currentTimeMillis();
		System.out.println("manyStrings : " + (end - start) + " ms");
	}
	
// w/ StringBuilder
	public static void useStringBuilder() {
		StringBuilder sb = new StringBuilder("b");
		
		long start = System.currentTimeMillis();
		for (int i =0; i<n; i++) {
			sb.append( " b");
		}
		
		long end = System.currentTimeMillis();
		System.out.println("useStringBuilder : " + (end - start) + " ms");
	}
	
/*	w/ StringBuffer == same as StringBuilder, but synchronized,
 * 		that is, it's safer to use when there are multiple threads
 *		in an application.
*/
	public static void useStringBuffer() {
		StringBuffer sb = new StringBuffer("c");
		
		long start = System.currentTimeMillis();
		for (int i =0; i<n; i++) {
			sb.append( " c");
		}
		
		long end = System.currentTimeMillis();
		System.out.println("useStringBuffer : " + (end - start) + " ms");
	}
}