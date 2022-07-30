package Collections;

import java.util.Set;
import java.util.TreeSet;

public class StringComparatorMain {

	public static void main(String[] args) {
		  Set<String> s1 = new TreeSet<>(new StringComparator());
	      s1.add("chamu");
	      s1.add("cham");
	      s1.add("cha");
	      s1.add("chamundi");
	      for(String str :s1) {
	    	  System.out.println(str);
	      }

	}

}
