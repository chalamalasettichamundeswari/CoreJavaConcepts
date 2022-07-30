package Collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		Object objects[]=new Object[100000];
		for(int i=0;i<objects.length;i++) {
			objects[i] = new Object();
		}
		
		List<Object> list = new LinkedList<>();
		long start=System.currentTimeMillis();
		for(Object obj : objects) {
			list.add(obj);
		}
		long end=System.currentTimeMillis();
		System.out.println(end-start);

	}

}
//Linked List is an ordered collection that stores the elements in the form of nodes.
//Each node has 3 fields :prev(points to the previous node),obj(stores the actual object),next(points to the next node)
//Adv:Insertions and deletes are very fast.
//Disadvantage->Takes more memory (contains the 3 fields),slow random access