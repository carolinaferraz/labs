//  pro lab - nested loops

package flowcontrol;

public class ProductPrinter {
	public static void main (String args[]) {
		int[] arr1 = { 2,4,6,8,10,12,14,16,18,20 };
		int[] arr2 = { 1,3,5,7,9,11,13,15,17,19};
		
//		iterate over the first set of numbers
		for(int i = 0; i < arr1.length; i++) {
//			iterate over second set of numbers
			for(int j = 0; j < arr2.length; j++) {
//				print the product of the current els from each set
				System.out.println(arr1[i] * arr2[j]);
			}
		}
	}
}
