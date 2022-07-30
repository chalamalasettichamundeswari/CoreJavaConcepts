package ExceptionHandling;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=9,b=0,c;
       try {
    	   c=a/b;
       }catch(RuntimeException e) {
    	   System.out.println("Arthmetic Exception "+e);
       }
       finally {
    	   System.out.println("Final execution");
       }
       
	}

}
//Types of errors:
//Compile Time Errors(syntax errors,Incompatible errors(Typecast errors),Invalid Method Declaration),this cannot be used inside static context
//Logical Errors
//RunTime Time Errors (Exceptions)Abnormal terminal of a program,Improper shutdown of the resources

//In java,Exception is a class.Whenever exception happens, jvm will throw an exceptions.
//Types:Predefined,Custom Exceptions
//Throwable ->Exception,Error
//Exception ->[RunTimeException->Arithmetic Exception,NullPointerException],IOException,FileNotFoundException,SQLException
//Error ->NoClasDefinitionFound,OutofMemoryError,NoSuchMethodError
//Classes inherit from exception->checked exception
//Classes inherit from runtime exception->unchecked exception
//Handling Exception->try,catch,throw,finally,throws
//try-might cause an exception statements
//catch-handle an exception
//throws is mainly used to handle the checked exceptions

