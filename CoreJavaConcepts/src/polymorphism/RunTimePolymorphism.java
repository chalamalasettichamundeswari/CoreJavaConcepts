package polymorphism;

public class RunTimePolymorphism {
	public static void main(String[] args) {
	//Implicit casting ->upcasting(lower to upper)
     MacBook mb1 = new MacBookPro();
     MacBook mb2 = new MacBookAir();
     mb1.start();
     mb1.shutdown();
     mb2.start();
     mb2.shutdown(); 
   //Explicit casting ->downcasting(upper to lower)
     MacBookPro mb3= (MacBookPro)mb1;
     mb3.start();
     mb3.shutdown();
	}

}
//run time or dynamic binding ->Achieve through method overriding 
//Method overriding ->define same methods with same signatures with different behaviours
//Left side always have the parent reference but right side classes will vary.
