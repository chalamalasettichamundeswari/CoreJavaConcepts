package Multithreading;

public class YieldMethodExample implements Runnable {

	public static void main(String[] args) {
		YieldMethodExample obj = new YieldMethodExample();
		Thread t = new Thread(obj);
		t.start();
		for (int j = 1; j <= 10; j++) {
			System.out.println("main thread");
		}
	}
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("child thread");
			Thread.yield();
		}
	}

}
//A yield() method is a static method of Thread class and it can stop the currently executing thread and will give a chance to other waiting threads of the same priority.