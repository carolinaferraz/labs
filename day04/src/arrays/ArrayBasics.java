package arrays;

public class ArrayBasics {

	public static void main(String[] args) {
		int [ ] numArray = new int [5];
//		creates an empty array w 5 values (0 default)
		
		System.out.println(numArray[1]);
		
		int[ ] numArrayTwo = new int[ ] {11, 22, 33, 44, 55};
//		initializes an array w all (in this case, also 5) values simultaneously 
		

		
		int [ ] numArrayThree= {44, 55, 66, 77, 88, 99, 111, 222};
//		called "anonymous" array because data type is not explicit
		
		System.out.println(numArrayThree[3]);
		System.out.println("arr length: " + numArrayThree.length);
		System.out.println("max index: " + (numArrayThree.length - 1));
		System.out.println();
		
//		reusing reference variable to store another array/obj location
		numArrayThree = new int[] { 17, 563, 7122, 499};
		System.out.println(numArrayThree[2]);
		
//		change/assign value using index
		numArrayThree[1] = 3650; 
		System.out.println(numArrayThree[1]);
		
	}
}