package Multithreading;

public class MultiThreaded extends Thread{

	public static void main(String[] args) throws InterruptedException {
		MultiThreaded obj = new MultiThreaded();
		obj.start();
		Thread thread = Thread.currentThread();
		thread.setName("Thread which is main");
		thread.setPriority(MAX_PRIORITY);
		System.out.println("Thread Name is: "+thread.getName()+"Thread priority: "+thread.getPriority());
		for(int j=0;j<80;j++) {
			System.out.print("j :"+j+"\t");
			Thread.sleep(1000);
		}
	}

	public void run() {
		Thread thread = Thread.currentThread();
		System.out.println("Thread Name is: "+thread.getName());
		for(int i=0;i<80;i++) {
			System.out.print("i :"+i+"\t");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
//There are two ways to create a thread:
//By extending Thread class
//By implementing Runnable interface.


//invoke the start method ->create a thread space for this thread(separate thread) and invoke the run method of thread class.
//Execution switches between 2 threads
//do mpre work with processor without wasting processor time
//sleep method - thread will not do anything
//if sleep method goes wrong causes interrupted exception

//Daemon Thread-Thread always runs in the background
//isDaemon ->to check whether thread is daemon or not
//setDaemon->to set the thread as daemon
//Never make the main thread as daemon thread

//Synchronization
//when multiple threads accessing the same thread simultaneously then they may corrupt each other's data.
//Especially if there are performing additions,deletions etc.. of the data on that object.
//This is where synchronization comes in.
//we use synchronized keyword and mark the method as synchronized
//Once we do that very first thread that access this method will have a lock on that object.so that no other thread will be able to access until the first thread releases.
//Acquiring and Releasing the lock is taken care by jvm.
//we simply mark the method as synchronized
//Synchronization is at the object level not method level.
//Contains 2 areas ->synchronized(operations like add,delete etc..),non-synchronized(operations like read)