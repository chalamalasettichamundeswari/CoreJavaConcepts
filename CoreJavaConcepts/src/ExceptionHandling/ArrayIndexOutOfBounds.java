package ExceptionHandling;

public class ArrayIndexOutOfBounds {

	public static void main(String[] args) {
      int arr[]= {3,5,6,7};
      System.out.println("Enter elements of an array");
      try {
      for(int i=0;i<=arr.length;i++) {
    	  System.out.println(arr[i]);
      }
      }catch(Exception e) {
    	  System.out.println(e);
      }
	}

}
