//Non Static Variable,Non Static Block,Non Static User Method,Constructor
public class NonStaticMembers {
   int num;
   NonStaticMembers(){
	   
	   System.out.println("Inside the constructor"+this.num);
   }
   {
	   System.out.println("Inside the non static block");
   }
   public static void main(String[] args) {
	 System.out.println("Inside the main method");
	 NonStaticMembers obj1 = new NonStaticMembers();
	 NonStaticMembers obj2 = new NonStaticMembers();
	 NonStaticMembers obj3 = new NonStaticMembers();
	 System.out.println(obj1.num);
	 System.out.println(obj2.num);
	 System.out.println(obj3.num);
   }
   static {
	  System.out.println("Inside the static block");
   }
   
}
//Non static blocks executed everytime we create an object
//static blocks got executed only once when the class is loaded


