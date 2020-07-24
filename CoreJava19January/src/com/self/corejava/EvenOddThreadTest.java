package com.self.corejava;

public class EvenOddThreadTest {
	public static void main(String[] args) throws InterruptedException {
		EvenOddThread objectA = new EvenOddThread();
		objectA.odd = true;

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					objectA.printOdd();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					objectA.printEven();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();
	}

}

class EvenOddThread {
	boolean odd;
	int count = 1;

	public synchronized void printEven() throws InterruptedException {
		while (count <= 10) {
			if (odd == true) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Even thread :" + count);
			count++;
			odd = true;
			notify();
		}
	}

	public synchronized void printOdd() throws InterruptedException {
		while (count <= 10) {
			if (odd == false) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Odd Thread :" + count);
			count++;
			odd = false;
			notify();
		}
	}

}
