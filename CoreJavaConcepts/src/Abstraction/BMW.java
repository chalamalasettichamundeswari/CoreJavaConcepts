package Abstraction;

public abstract class BMW {
   void commonFunc() {
	   System.out.println("Inside Common Functionality method");
   }
   abstract void accelerate();	 
   public static void main(String[] args) {
	System.out.println("Inside the main method");
  }
}
//Cannot make abstract class as final.cannot inherit it.
//Cannot make abstract method as static cannot provide implementation in other class
//If static method defined in parent class it can be overridden with static method only.
//If use the same variables in both parent and sub class then super class vraible val returned,cause variables are resolving at compile time.
