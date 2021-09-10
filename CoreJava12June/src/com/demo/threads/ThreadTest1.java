package com.demo.threads;

public class ThreadTest1 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Task1());
		Thread t2 = new Thread(new Task1());
		t1.start();
		t2.start();

	}

}

class Task1 extends Thread {

	public void start() {
		System.out.println("Start method");
	}

	public void run() {
		System.out.println("Run method");
	}

}
