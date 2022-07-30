package Collections;

import java.util.Set;
import java.util.TreeSet;

public class StringBufferMain {

	public static void main(String[] args) {
		Set<StringBuffer> s2 = new TreeSet<>(new StringBufferComparator());
		s2.add(new StringBuffer("chamu"));
		s2.add(new StringBuffer("cham"));
		s2.add(new StringBuffer("cha"));
		for (StringBuffer string : s2) {
			System.out.println(string);
		}

	}

}
