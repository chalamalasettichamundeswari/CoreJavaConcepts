package Java8Features;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
      Function<String,Integer> f = s->s.length();
      System.out.println(f.apply("chamu"));
      System.out.println(f.apply("chalamalasetti chamundeswari"));
	}

}
//Functions are similar to predicates except that they can return any type of result.
//contains one method called apply takes any types of parameters and return any type.
//interface Function(T,R){R apply(T t);}
