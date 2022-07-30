
public class TypeCasting {

	public static void main(String[] args) {
    //Implicit Conversion
	byte b=100;
	int c =b;
	System.out.println(c); 
	
	char ch ='A';
	int x = ch;
	System.out.println(x); 
	
	//Explicit Conversion
	int k=100;
	byte y= (byte) k;
	System.out.println(y); 
	
	int l=97;
	char t= (char) l;
	System.out.println(t); 
	
	//Explicit beyond range
	int p=129;
	byte u= (byte) p;
	System.out.println(u); 
	}

}
