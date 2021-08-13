package strings;

public class StringPool {
	public static void main (String[] args) {
		
//		String str1 = "hello world";
//		String str2 = new String("hello world");
//		String str3 = "hello world";
//		
//		System.out.println(str1 == str2); // f
//		System.out.println(str1.equals(str2)); // t
//		
//		System.out.println(str1);
//		System.out.println(str2);
//		
//		System.out.println(str1 == str3); // t
//		System.out.println();

//		array
		char[] wordOne = {'c', 'a', 't'};
		System.out.println(wordOne[2]);
	
		
//		string class / cannot be iterated w loop
		String wordTwo = "cat";
		System.out.println(wordTwo.charAt(0));
		
		
		System.out.println();
		String sentence = "sentence broken apart using string.split()";
		
		String[] words = sentence.split(" ");
		for (String w : words) {
			System.out.println(w);
		}
		
//			case sensitive
		String upper = "PIE";
		String lower = "pie";
			System.out.println();
			System.out.println(upper.equals(lower));
			System.out.println(upper.equalsIgnoreCase(lower));
			
	}
}