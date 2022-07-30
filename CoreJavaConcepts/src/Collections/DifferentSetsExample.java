package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class DifferentSetsExample {

	public static void main(String[] args) {
     Random obj = new Random();
     HashSet<Integer> set = new LinkedHashSet<>();
     for(int i=1;i<=5;i++) {
    	 int number = obj.nextInt(100);
    	 set.add(number);
    	 System.out.println(number);
     }
     System.out.println("HashSet elements "+set);
	}

}
