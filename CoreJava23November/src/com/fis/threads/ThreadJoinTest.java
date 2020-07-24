package com.fis.threads;

public class ThreadJoinTest {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName());
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i <= 4; i++)
				{
					System.out.println("Thread t1 called");
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
				}

			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread t2 called");

			}
		});
		t1.start();
		//start thread t2 only after t1 is dead or after 5000ms.
		t1.join(5000);
		t2.start();
	}
}
