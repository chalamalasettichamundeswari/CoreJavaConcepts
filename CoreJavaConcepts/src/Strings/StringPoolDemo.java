package Strings;

public class StringPoolDemo {

	public static void main(String[] args) {
     Product prod1 = new Product(1,"detergent");
     Product prod2 = new Product(2,"soap");
     System.out.println(prod1);
     System.out.println(prod2);
     String s1="chamu";
     String s2="chamu";
     if(s1==s2) {
    	 System.out.println(s1.hashCode()+" "+s2.hashCode());
     }
     if(s1.equals(s2)) {
    	 System.out.println(s1.hashCode()+" "+s2.hashCode());
     }
     System.out.println(s1.hashCode());
     System.out.println(s2.hashCode());
	}

}
