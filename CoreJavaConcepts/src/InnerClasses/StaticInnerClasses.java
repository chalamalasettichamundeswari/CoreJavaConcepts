package InnerClasses;

public class StaticInnerClasses {
	
	static void f1() {
	  System.out.println("Outer static method");
	}

	static class Inner{
		static void f2() {
			System.out.println("Inner static method");
		}
		void f3() {
			System.out.println("Inner non static method");
		}
	}
	public static void main(String[] args) {
		StaticInnerClasses.f1();
		StaticInnerClasses.Inner.f2();
		StaticInnerClasses.Inner obj = new StaticInnerClasses.Inner();
		obj.f3();
		
	}

}
