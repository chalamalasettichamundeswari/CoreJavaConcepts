package MoreInheritanceConcepts;
//Single Inheritance ->If a child class extends the parent class

//class inbuilt extends the object class 

//MultiLevel Inheritance->A class inherits properties from a class which again has inherits properties.

public class Parent {
	int a,b;
	public Parent(int a,int b) {
		this.a=a;
		this.b=b;
      System.out.println("Parent Object"+this);
	}
    
	Parent(){
		 System.out.println("No args constructor");
	}

	public void p1() {
		System.out.println("Parent class method p1");
	}
}
