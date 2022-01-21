package datastructure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */


	}

	Map<String, Integer> puppyMap = newHashMap()
			//storing
			puppyMap.put("Lucky", 1111);
			puppyMap.put("Boba", 2222);
			puppyMap.put("Chance", 3333);
			puppyMap.put("Octo", 4444);
			//retrieving
			puppyMap.containsKey(4444);

			System.out.println(puppy.get(2222));

			//iterator
			Iterator<String, Integer> it = puppyMap.keySet().iterator();
			while(it.hasNext()) {
				String key = it.next();
				Integer value = puppyMap.get(key);
				System.out.println("key = " + key + "value =" + value);
	}

	}


}