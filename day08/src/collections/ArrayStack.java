package collections;

public class ArrayStack {
//	arbitrarily creates an arr w/ size 5:
	
	private Integer[] stack = new Integer[5];
	
//	lastElementIndex = (index - 1) 
	
	private int lastElementIndex = 0;
	
//	push method to add el:
	public void push(int element) {
		if (lastElementIndex >= stack.length) {
			
			Integer[] tempStack = new Integer[stack.length * 2];
			
			for (int j=0; j < stack.length;  j++) {
				tempStack[j] = stack[j];
			} 
			tempStack = stack;
		}	
		
		stack[lastElementIndex] = element;
		lastElementIndex++;
	}
	
//	pop method to remove el:
	public Integer pop() {
		if (lastElementIndex > 0) {
			
//			arrayStack.push(111);
//			lastElementIndex = 1;
//			
//			arrayStack.push(222);
//			lastElementIndex = 2;
//			
//			arrayStack.pop();
//			lastElementIndex = 1;
			
			return stack[--lastElementIndex];
			
		} else return null;
	}
	
//	 peek method to view last el
	public Integer peek() {
		if(lastElementIndex > 0)
			return stack[lastElementIndex -1];
		return null;
	}
}