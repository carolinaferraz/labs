// pro lab 
//w/ print statements to verify behavior 

package collections;

import java.util.Arrays;

public class Stacks {
	private int lastItem = 0;
	private int[] items = new int[0];
	
//	add items to stack
	public void push(int newItem) {
		int index = items.length; 
		
		System.out.println("array lenght : " + index);
		
// increases array by 1 so that a new item can be added
		items = new int[items.length+1]; 
		System.out.println("items after increasing array by 1: " + Arrays.toString(items));
		
		items[index] = newItem; // store value in index
		System.out.println("items storing new value: " + Arrays.toString(items));
		
		lastItem = newItem; // updates lastItem		
		System.out.println("lastItem: " + lastItem);
	}
	
	
//	 remove items
	public int pop() {
		
//		pick last item off & store in var :
		int tempItem = lastItem;
		
//		new temp array copies original *minus the last item* :
		int[] newArray = new int[items.length-1];
		
		for(int i=0;i<newArray.length; i++) {
			newArray[i] = items[i];
		}
		
//		update the items array
		items = newArray;
//		update lastItem
		lastItem = items[items.length-1];  
//		return popped element
		return tempItem;
	}
	
//	view last item
	public int peek() {
		return 0;
	}
}
