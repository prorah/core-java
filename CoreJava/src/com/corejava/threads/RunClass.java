package com.corejava.threads;

public class RunClass implements Runnable {

	@Override
	public void run() {
		System.out.println("run method invoked");
		System.out.println(Thread.currentThread().getName());
	}

}
