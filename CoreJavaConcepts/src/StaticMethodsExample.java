
public class StaticMethodsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethodsExample.method1();
	}
	
	static void method1() {
		System.out.println("Inside method1");
	}
	
	static {
		System.out.println("Inside static block");
	}
	
}
