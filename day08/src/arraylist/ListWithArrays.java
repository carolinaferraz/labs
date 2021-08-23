// pro lab 

package arraylist;

public class ListWithArrays {
	
//	1. define String array & its default.
	private String[] elements = new String[8];

	
//	2. have a way to retrieve an element ('get'  method ).
	public String get (int index) {
		return this.elements[index];
	}
	
//	3. have a way to set a specific element if provided an index and a value ('set'  method).
	public void set (int index, String value) {
		this.elements[index] = value;
	}
	
/*	4. add an element to front of array */
	public int add(String value) {
		int index = -1;
		
//	check if there's a null value before adding new
		for(int i =0; i < elements.length; i++) {
			if(null == elements[i]) {
				elements[i] = value;
				return i;
			}
		}
		
//	create temp array to hold new values since arrays cannot be changed directly
		String[] temp = new String[elements.length*2];
		
		for (int i=0;i<elements.length;i++) {
			temp[i] = elements[i];
		}
		
//	add new value
		index = elements.length;
		temp[elements.length] = value;
		
//	copy temp to elements variable
		elements = temp;
		
		return index;
	}
	
	
/*	5. remove an element & return it  */
	public String remove() {
		int index = -1;
		String value = "";
		
//		loop through list backwards and remove last el:
		
		for(int i=elements.length-1;i>=0;i--) {
			if(null!=elements[i]) {
				index = i;
				value = elements[i];
				elements[i] = null;
				break;
			}
		}
		
//		return early if index is still -1 (meaning empty list)
		if(index == -1) {
			return value;
		}
		
//		check if array size needs to be decreased
		if(index%8==0 && elements.length >8 && elements.length>index) {
			String[] temp = new String[index];
			
			for(int i=0;i<temp.length;i++) {
				temp[i]=elements[i];
			}
			
//			copy temp to els var :)
			elements =temp;
		}
		return value;
	}

}
