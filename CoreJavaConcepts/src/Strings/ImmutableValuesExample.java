package Strings;

public class ImmutableValuesExample {

	int id;
	String name;
	ImmutableValuesExample(int id,String name){
		this.id=id;
		this.name=name;
	}
	public static void main(String[] args) {
		ImmutableValuesExample obj =new ImmutableValuesExample(1,"chamundeswari");
		System.out.println(obj);
		
		String name=new String("durgadevi");
		System.out.println(name);
		
		Integer i= new Integer(80);
		System.out.println(i);
				
	}

}
