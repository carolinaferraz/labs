// exploring more HashMap methods ❤ 

package collections;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class DictionaryKeySet {
	public static void main(String[] args) {
		
		HashMap<String, String> dictionary = new HashMap<>();
		dictionary.put("apple", "\ud83c\udf4e apple description");
		dictionary.put("tangerine", "\ud83c\udf4a tangerine description");
		dictionary.put("cantaloupe", "\ud83c\udf48 cantaloupe description");
		
		TreeMap<String, String> sortedDictionary = new TreeMap<>();  
        sortedDictionary.putAll(dictionary);
        
		sortedDictionary.put("peach", "peach \ud83c\udf51 description");
        System.out.println(sortedDictionary);
        
//	create a Set of keys : 
        	Set<String> keys = sortedDictionary.keySet();
        	
        	for(String s: keys) {
        		System.out.println("key: " + s);
        	}
        
        
	}
}
