package Java8Features;

public class FunctionalInterfaceMain {

	public static void main(String[] args) {
//		FunctionalInterfaceMain obj = new FunctionalInterfaceMain();
//		obj.myMethod();
		
		A obj = ()->System.out.println("Example for Functional Interface");
		obj.myMethod();
	}


//	@Override
//	public void myMethod() {
//     		System.out.println("Example for Functional Interface");
//	}

}
//Functional Interface -contains one and only one abstract method(functional method).
//Examples of Functional interface ->Runnable->run method which is abstract,COmaparator->compareTo method which is abstract
//If we mark interface with @FunctionalInterface,can define only one abstract method in that interface.
