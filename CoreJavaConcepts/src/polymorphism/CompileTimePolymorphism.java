package polymorphism;

public class CompileTimePolymorphism {
	void add(int a,int b) {
		int res= a+b;
	    System.out.println("Result is : "+res);
	}
	void add(float a,float b) {
		float res= a+b;
	    System.out.println("Result is : "+res);
	}
	void add(float a,float b,float c) {
		float res= a+b+c;
	    System.out.println("Result is : "+res);
	}
	public static void main(String[] args) {
		CompileTimePolymorphism obj = new CompileTimePolymorphism();
		obj.add(90, 80);
		obj.add(45f, 6f);
		obj.add(9f,8f,7f);
	}

}

//Polymorphism ->2 types:
//compile time or static binding ->Achieve through method overloading 
//Method overloading ->define different methods with same name but with different signatures(return type,order,type,no of arguments).
//In compile time binding,the compiler selects which specific method should be executed by the jvm
//Main methods are also pverloaded.
