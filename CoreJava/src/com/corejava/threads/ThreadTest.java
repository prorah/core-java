package com.corejava.threads;

public class ThreadTest {

	public static void main(String[] args) {
		Thread t = new Thread(new RunClass());
		t.setName("demo thread");
		t.start();

		Thread t1 = new Thread(() -> System.out.println("new thread"));
		t1.start();
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread t2 created");
			}
		});
		t2.start();

	}

}
