// ListWithArrays.java Simulator

package arraylist;

public class ListWithArraysSim {
	public static void main(String[] args) {
		ListWithArrays list = new ListWithArrays();
		
		list.set(0, "apple");
		System.out.println(list.get(0));
		
		
//		implementing add method:
		int index = list.add("banana");
		System.out.println(index);
		System.out.println(list.get(index));
		
		list.add("canteloupe");
		list.add("dragonfruit");
		list.add("elderberry");
		list.add("fig");
		list.add("grape");
		list.add("honeyberry");
		list.add("jujube");
		
		
//		implementing remove method:
		String value = list.remove();
		System.out.println(value);
		
		value=list.remove();
		System.out.println(value);
	}
}