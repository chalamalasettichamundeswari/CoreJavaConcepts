package Streams;

import java.util.StringTokenizer;

public class StrringTokenizerExample {

	public static void main(String[] args) {
      String s= "chamu,!@%hello hey there";
      StringTokenizer st = new StringTokenizer(s,",!@%");
      while(st.hasMoreTokens()) {
    	  System.out.println(st.nextToken());
      }
	}

}
