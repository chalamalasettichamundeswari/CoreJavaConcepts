package Java8Features;

public class SumMainClass{

	public static void main(String[] args) {
      Sum obj =(a,b)->System.out.println("sum of 2 numbers: "+(a+b));
      obj.add(8, 7);
	}

}
