package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */
		Queue<String> toddClass = new LinkedList<String>();

		//add

		toddClass.add("Emmy Nuelle");
		toddClass.add("Jarak Edgar");
		toddClass.add("Lyka Faye);
		toddClass.add("Drax Marco");

		//poll and or remove

		toddClass.poll("Jarak");

        //peek

		System.out.println(toddClass.peek());
		System.out.println(toddClass);

		//Iterator
		Iterator<String, String> it = toddClass.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = toddClass.get(key);
			System.out.println("key = " + key + "value =" + value);





	}

}
