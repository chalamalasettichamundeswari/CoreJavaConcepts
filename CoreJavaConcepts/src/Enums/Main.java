package Enums;

public class Main {

	public static void main(String[] args) {
		Databases db = Databases.MYSQL;
		System.out.println(db);
		Databases[] types = Databases.values();
		for(Databases type : types) {
			System.out.println(type);
			System.out.println(type.ordinal());
		}
		
	}

}

//By default toString is written to override the string