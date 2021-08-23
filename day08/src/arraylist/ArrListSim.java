// simulator for ArrayList 

package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrListSim {
	public static void main(String[] args) {
		ArrayList<Item> items = new ArrayList<Item>();
		
//		adding items to list
		items.add(new Item(1, "im item 1"));
		items.add(new Item(2, "im item 2"));
		items.add(new Item(3, "im item 3"));
		items.add(new Item(4, "im item 4"));
		items.add(new Item(5, "im item 5"));
		
		Iterator<Item> iter = items.iterator();
		
		while(iter.hasNext() ) {
			Item item = iter.next();
			System.out.println("removing items: " + item);
			iter.remove();
			}
//		check that size == 0
		System.out.println(items.size());
	}

}
