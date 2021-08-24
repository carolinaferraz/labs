package arrays;

/*
 * arrays are collections of info. we can hold onto collections
 * of primitives or objects. since arrays are objects,
 * we can also hold a collection of arrays!
 */

public class MultiDimensional {

	public static void main(String[] args) {
		int [ ] one = {1, 2, 3};
		int [ ] two = {4, 5, 6};
		int [ ] three = {7, 8, 9};
		
		int [ ] [ ] twoDee = new int [ ] [ ] {{1,2,3}, {4,5,6}, {7,8,9}};
		
		System.out.println(one[2]);
		System.out.println(twoDee[0][1]);
		System.out.println(twoDee[2][0]);
	}

}