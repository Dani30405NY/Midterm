package datastructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

	}
	ArrayList fluffyList = new ArrayList;
	// add to ArrayList
	fluffyList.add("Elmo");
	fluffyList.add("Cookie Monster");
	fluffyList.add("Ernie");
	fluffyList.add("Count von Count");

	//remove from Arraylist
	fluffyList.remove("Ernie");

	//retrieving elements from Arraylist
	System.out.println("fluffyList");

	//using Iterator
	Iterator<String> iterator = fluffyList.iterator();
	while(iterator.hasNext()) {
		String next = String.valueOf(iterator.hasNext());
		System.out.println(next);
	}

}

