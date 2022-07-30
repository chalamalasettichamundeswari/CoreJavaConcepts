package A;
import java.util.Scanner;
import static java.lang.Integer.*;
public class ClassA {
   public static void a1() {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter values.....");
	   int num1=parseInt(sc.next());
	   int num2=parseInt(sc.next());
	   System.out.println("Inside a1 "+(num1+num2));
   }
   public void a2() {
	   System.out.println("Inside a2");
   }
}
