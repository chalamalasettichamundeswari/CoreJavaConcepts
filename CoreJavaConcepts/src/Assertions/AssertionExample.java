package Assertions;

public class AssertionExample {

	public static void main(String[] args) {
      int withdrawamnt = 100;
      int currentbal = 80;
      assert(withdrawamnt<currentbal):"withdraw amount is more than current balance";
      
	}

}
//Assertions introduced in java 1.4 used for testing and debugging
//assert expression ->if not throw an AssertionError(java.lang.error)
//assert expression1:expression2
//Assertion disabled by default java -ea MyClass(enable),java -da(disable),java -esa(enable system level assertions),java -dsa(disable system level class assertions)
//for enabling assertions go to run configurations under arguments ->vm arguments provide -da
