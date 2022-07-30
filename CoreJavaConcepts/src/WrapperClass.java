//Primitive Types ->Wrapper Classes ->Object Types
//Eg:byte->Byte
//Primitive to Object ->boxing
//Object to Primitive  ->unboxing
public class WrapperClass {
 public static void main(String[] args) {
    //Boxing
	int h=90;
	Integer i =Integer.valueOf(h);
	int f= i.intValue();
	System.out.println(i+" "+f);
	
	//Primitive to String & viceversa
	int k=87;
	String s = Integer.toString(k);
	int h1=Integer.parseInt(s);
	
	//Wrapper class constructors
	int o=98;
	Integer i1 = new Integer(o);
	System.out.println(i1);
}
}
