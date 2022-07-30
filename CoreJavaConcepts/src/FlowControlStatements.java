//Selection ->if-else,switch
//Iterative ->while,do-while,for,for-each
//Transfer ->break,continue,return,try-catch-finally,assert
public class FlowControlStatements {

	public static void main(String[] args) {
	// if-else statement
     if(true)
    	 System.out.println("Hey There!!");
     else
    	 System.out.println("Sorry!!!");
	
	
	//switch statement
	int a=9;
	switch(a) {
	case 1:
	case 9:
		 System.out.println("Case 1");
		 break;
	default:
		System.out.println("Default");
	}
	
	//while statement
	int x=10;
	while(x<=100) {
		 System.out.println(x);
		 x++;
	}
	
	//do-while statement
    do {
      System.out.println("Inside Loop");
    }while(x<=70);
    
    //for statement
    for(int j=0;j<8;j++) {
    	System.out.println(j);
    }
    
    //Break->stops the execution once break statement is executed.
    for(int j=0;j<8;j++) {
    	if(j==5) {
    		break;
    	}
    	System.out.println("Break example:"+j);
    }
    
  //Continue->skips the particular execution
    for(int j=0;j<8;j++) {
    	if(j==5) {
    		continue;
    	}
    	System.out.println("Continue example:"+j);
    }
    
	
	}	
}
