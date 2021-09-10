package com.demo.threads;

public class ThreadTest {

	public static void main(String[] args) {
		Runnable runnable = () -> System.out.println(Thread.currentThread().getName());
		Thread t = new Thread(runnable);
		t.start();
	}

}
