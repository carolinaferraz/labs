package collections;

import java.util.HashMap;
import java.util.TreeMap;

public class Dictionary {
	public static void main(String[] args) {
		HashMap<String, String> dictionary = new HashMap<>();
		dictionary.put("apple", "\ud83c\udf4e apple description");
		dictionary.put("tangerine", "\ud83c\udf4a tangerine description");
		dictionary.put("cantaloupe", "\ud83c\udf48 cantaloupe description");
		
//		System.out.println(dictionary);
		
//	get value using key
		String key = "apple";
		String value = dictionary.get(key);
		System.out.println("the value for the key: " + key + " is " + value);
		System.out.println();
		
		
/*	define a new TreeMap */
		
		TreeMap<String, String> sortedDictionary = new TreeMap<>();
		
// using the putAll method to add all items in dictionary into sortedDictionary
		sortedDictionary.putAll(dictionary);
//		System.out.println(sortedDictionary);
		System.out.println();
		
//	add new item to Tree
		sortedDictionary.put("peach", "peach \ud83c\udf51 added w/ TreeMap ");
		System.out.println("hello from treeMap !");
		System.out.println(sortedDictionary);
		System.out.println();
		
//	re-add item to observe element gets replaced, key does not get duplicated !
		sortedDictionary.put("cantaloupe", "\ud83c\udf48 a different cantaloupe description");
		System.out.println(sortedDictionary);
		
	}
}
