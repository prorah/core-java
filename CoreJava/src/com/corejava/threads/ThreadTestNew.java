package com.corejava.threads;

public class ThreadTestNew extends Thread {

	public static void main(String[] args) {
		ThreadTestNew t = new ThreadTestNew() {
			@Override
			public void run() {
				System.out.println("run method invoked");
				System.out.println(Thread.currentThread().getName());
			}

		};
		t.setName("current thread");
		t.start();
	}
}