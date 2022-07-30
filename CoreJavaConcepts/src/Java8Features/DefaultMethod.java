package Java8Features;

public interface DefaultMethod {
   default void m1() {
	   System.out.println("m1 inside DefaultMethod");
   }
}
