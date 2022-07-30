package Collections;

import java.util.ArrayList;
import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();//right side specifying data type in <> is optional.
//		list.add(new Integer(20));
//		list.add(10);
		for(int i=10;i<=100;i=i+10) {
			list.add(i);
		}
		System.out.println("list: "+list);
		list.add(5,900);
		System.out.println("list After Inserting: "+list);
		list.set(2, 800);
		System.out.println("list After Replacing: "+list);
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		System.out.println("second list: "+list1);
		list.addAll(6,list1);
		System.out.println("first list after using add all method: "+list);
		if(list.contains(1)) {
			System.out.println("list has the value");
		}else {
			System.out.println("list doesnot has the value");
		}
		System.out.println("size of an array:"+list.size());
		
		//Get elements in an list 
		for(int i=0;i<list.size();i++) {
			System.out.println("Elements in te list:"+list.get(i));
		}
		//Removing the elment in an index
		System.out.println(list.remove(1));
		System.out.println("After removing the element: "+list.size());
	}

}
//ArrayList uses an array to store the objects.Access is very fast because it can internally use the array index to locate the object.
//At the same time,insertions and deletions are very slow,it will reshuffle the entire array
//Initial capacity is 1
//Use ArrayList,If we want to do a lot of read operations
