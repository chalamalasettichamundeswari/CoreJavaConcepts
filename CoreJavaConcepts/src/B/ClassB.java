package B;
import A.ClassA;

public class ClassB {
	 public static void a1() {
		   System.out.println("Inside same package a1");
	   }
	public static void main(String[] args) {
        ClassA.a1();
        ClassA a = new ClassA();
        a.a2();
        a1();
	}

}
