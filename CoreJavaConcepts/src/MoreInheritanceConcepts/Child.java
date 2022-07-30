package MoreInheritanceConcepts;
//In Inheritance both classes shares the same memory location
//Hierarchial Inheritance -> Always inherits the same base class
//Constructor Chaining ->super and this keywords can do this .
public class Child extends Parent{
	int c,d;
	Child(int a,int b,int c,int d){
		super(a,b);
		super.p1();
		this.c=c;
		this.d=d;
	    System.out.println("Child Object"+this+"\nsum is: "+(a+b+c+d));
	}
	Child(){
		this(9,8,7,0);
		System.out.println("No args constructor");
	}
	public void p1() {
		System.out.println("Child class method p1");
	}
    public static void main(String[] args) {
	  Child c = new Child();
	  c.p1();
	  //c.p2();
   }
}
//Method Overriding rules
//The argument list should be exactly the same as that of the overridden method.
//The return type should be the same or a subtype of the return type declared in the original overridden method in the superclass.
//The access level cannot be more restrictive than the overridden method's access level. For example: If the superclass method is declared public then the overriding method in the subclass cannot be either private or protected.
//Instance methods can be overridden only if they are inherited by the subclass.
//A method declared final cannot be overridden.
//A method declared static cannot be overridden but can be re-declared.
//If a method cannot be inherited, then it cannot be overridden.
//A subclass within the same package as the instance's superclass can override any superclass method that is not declared private or final.
//A subclass in a different package can only override the non-final methods declared public or protected.
//An overriding method can throw any uncheck exceptions, regardless of whether the overridden method throws exceptions or not. However, the overriding method should not throw checked exceptions that are new or broader than the ones declared by the overridden method. The overriding method can throw narrower or fewer exceptions than the overridden method.
//Constructors cannot be overridden.
