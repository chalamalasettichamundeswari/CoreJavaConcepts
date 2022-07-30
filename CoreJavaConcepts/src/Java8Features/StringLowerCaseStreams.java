package Java8Features;

import java.util.*;
import java.util.stream.Collectors;

public class StringLowerCaseStreams {

	public static void main(String[] args) {
       List<String> li = new ArrayList<String>();
       li.add("WORLD");
       li.add("HELLO");
       li.add("HEY");
       List<String> collect = li.stream().map(s->s.toLowerCase()).collect(Collectors.toList());
       System.out.println(collect);
	}

}
