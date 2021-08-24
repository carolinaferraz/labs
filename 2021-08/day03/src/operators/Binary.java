package operators;

public class Binary {
	public static void main(String[] args) {
		int x = 10;
		int y = 3;
		int z = 2;
				
		System.out.println(x % y); // % = prints remainder of the operation (1) 
		System.out.println(x % z);  // prints (0) bc 10/2 = 5
		
//		division and decimal points
		int i = (int) 9.99;
		
		System.out.println(i); // 9
		System.out.println(10 / 3); // 3
		System.out.println(10.0 / 3.0); // 3.333
	}
} 