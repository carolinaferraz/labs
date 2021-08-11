package basics;

public class PrimitiveTypes {
	public static void main (String[] args) {
		byte b = -128;
//		max value of byte datatype  is 127. after that, it has to be an int.
		System.out.println(b);
		
		byte b2 = (byte)1000;
/*		using casting. when the limit of the datatype is reached, 
 * 		we observe a subset of binary digits to determine values */
		System.out.println(b2);
		
		short s = 110;
		System.out.println(s);
		
		int i = 120;
		System.out.println(i);
		
		long l = 130000L;
//		the letter L is required to represent longs
		System.out.println(l);
		
		
		float f = 3.14F;
//		the letter F is required to represent floats.  32-bits
		System.out.println(f);
		
		
		double d = 3.14;
// 		64-bits
		System.out.println(d);
		
		char c = 'C';
		System.out.println(c);
		
		long bigger = 1000;
		int smaller = (int)bigger;
		System.out.println(smaller);
		
	}
}
