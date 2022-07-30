package Multithreading;

public class ImplementRunnableInterfaceExample implements Runnable {

	@Override
	public void run() {
     		System.out.println("Processed the checks");
	}
	public static void main(String[] args) {
		ImplementRunnableInterfaceExample obj = new ImplementRunnableInterfaceExample();
		Thread t = new Thread(obj);
		t.start();
	}

}
//Implements Runnable better than extends thread,cause if we want to extends the any other classes we can do it easily whereas with extends thread not applicable cause we cannot implement the multiple inheritance 
