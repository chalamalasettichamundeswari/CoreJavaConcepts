
public class CommandLineArgs {
 public static void main(String[] args) {
	int length = args.length;
	if(length==0) {
		System.out.println("No Inputs provided");
	}else {
		for(int i=0;i<length;i++) {
			System.out.println(args[i]);
		}
	}
}
}

//Click on dropdown beside run button
//Run configurations ->click on top left first icon and pass arguments under program arguments