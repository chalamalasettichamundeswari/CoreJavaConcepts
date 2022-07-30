package Multithreading;

public class InteruptMethodExample extends Thread{

	public static void main(String[] args) {
		InteruptMethodExample obj = new InteruptMethodExample();
		obj.start();
		obj.interrupt();
		System.out.println("End of the main method");
		
	}
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("I am a lazy thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
//A thread that is in the sleeping or waiting state can be interrupted with the help of the interrupt() method of Thread class.
