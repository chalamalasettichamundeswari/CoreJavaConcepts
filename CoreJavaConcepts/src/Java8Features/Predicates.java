package Java8Features;

import java.util.function.Predicate;

public class Predicates {

	public static void main(String[] args) {
		
		Predicate<Integer> p = i->(i>20);
		System.out.println(p.test(15));
		System.out.println(p.test(65));

	}

}
//Predicate is a function with a single argument and it returns a boolean value
//In java 1.8 use a predicate interface (functional interface) contains only one abstract method.
//interface Predicate<T>{public boolean test(T t);}