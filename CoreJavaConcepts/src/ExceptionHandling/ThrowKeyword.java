package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		try {
         throw new RuntimeException("Funds not available"); 
		}catch(RuntimeException e) {
			System.out.println(e);
		}
	}

}
