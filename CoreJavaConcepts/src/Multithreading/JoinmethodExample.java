package Multithreading;

import java.util.Scanner;

public class JoinmethodExample extends Thread{
  static int n,sum=0;
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
        System.out.println("sum of first 'N' numbers");
        System.out.println("Enter a value");
        JoinmethodExample.n= sc.nextInt();
        JoinmethodExample obj = new JoinmethodExample();
        obj.start(); 
        try {
			obj.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("sum of first "+JoinmethodExample.n+" numbers is : "+JoinmethodExample.sum);
        long end = System.currentTimeMillis();
        System.out.println("Time Taken: "+(end-start)/1000+"s");
	}
	public void run() {
		for(int j=0;j<JoinmethodExample.n;j++) {
			JoinmethodExample.sum = JoinmethodExample.sum + j;
		}
	   try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
//When the join() method is invoked, the current thread stops its execution and the thread goes into the wait state.
//The current thread remains in the wait state until the thread on which the join() method is invoked has achieved its dead state. 
//If interruption of the thread occurs, then it throws the InterruptedException.

