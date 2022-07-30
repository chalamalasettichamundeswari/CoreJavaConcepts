package Interfaces;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Honda obj = new Honda();
     obj.go();
     obj.stop();
	}

}

//Interface vs Abstract Class

//Abstract Class
//Abstract class can have abstract and non-abstract methods.
//Abstract class can have final, non-final, static and non-static variables.
//A Java abstract class can have class members like private, protected
//Contains static,abstract blocks
//Contains constructors

//Interface
//Interface can have only abstract methods. Since Java 8, it can have default and static methods also.
//Interface has only public static and final variables.
//variables should be initialized
//Members of a Java interface are public and abstract by default
//Can not contain blocks
//cannot contains constructors


//final keyword
//class ->Cannot be inherited
//variable->value cannot be changes and reference cannot be changed.
//method ->Cannot be overridden in a child class
