package Strings;

public class ImmutableDemo {

	public static void main(String[] args) {
      String s1="Hello";
      String s2="World";
      System.out.println("Before concat:\n"+"s1 :"+s1+"\n"+"s2 :"+s2);
      s1=s1.concat(s2);
      System.out.println("After concat:\n"+"s1 :"+s1+"\n"+"s2 :"+s2);
	}

}
