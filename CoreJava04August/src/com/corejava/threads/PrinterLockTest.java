package com.corejava.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrinterLockTest {

	public static void main(String[] args) {

		PrinterQueue printerQueue = new PrinterQueue();
		for (int i = 0; i < 10; i++) {
			Thread t = new Thread(new Printer(printerQueue), "Thread " + i);
			t.start();
		}
	}
}

class Printer implements Runnable {

	private PrinterQueue printerQueue;

	public Printer(PrinterQueue printerQueue) {
		this.printerQueue = printerQueue;
	}

	@Override
	public void run() {
		System.out.println("Going to print a document :" + Thread.currentThread().getName());
		printerQueue.printJob();
	}

}

class PrinterQueue {
	private final Lock lock = new ReentrantLock();

	public void printJob() {
		lock.lock();
		System.out.println("Started printing Job: " + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}

		System.out.println("Done printing Job: " + Thread.currentThread().getName());

		lock.unlock();
	}
}
