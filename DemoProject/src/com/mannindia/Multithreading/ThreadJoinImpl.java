package com.mannindia.Multithreading;

//This class demonstrates the join method of thread class
public class ThreadJoinImpl {

	public static void main(String[] args) throws InterruptedException {
		{
			Thread t = new Thread(new Runnable() {
				public void run() {
					System.out.println("First task started");
					System.out.println("Sleeping for 2 seconds");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("First task completed");
				}
			});
			Thread t1 = new Thread(new Runnable() {
				public void run() {
					System.out.println("Second task completed");
				}
			});
			t.start();
			// the below line of code causes the t1 thread to start either when
			// t is dead or after 1 second
			t.join(1000);
			t1.start();
		}
	}

}
