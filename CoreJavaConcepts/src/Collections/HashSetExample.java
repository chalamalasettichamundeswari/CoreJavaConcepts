package Collections;

import java.util.Random;
import java.util.*;
public class HashSetExample {

	public static void main(String[] args) {
       Random obj = new Random();
       List<Integer> list = new ArrayList<>();
       for(int i=0;i<10;i++) {
    	   int number = obj.nextInt(5);
    	   list.add(number);
       }
       System.out.println("list: "+list);
       Set<Integer> set = new HashSet<>(list);
       System.out.println("set: "+set);
     //  int x = obj.nextInt();
     //  int x = obj.nextInt(10);//specify the limit
     //  System.out.println(x);
	}

}
