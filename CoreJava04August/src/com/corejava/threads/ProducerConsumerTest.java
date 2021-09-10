package com.corejava.threads;

import java.util.LinkedList;

public class ProducerConsumerTest {

	public static void main(String[] args) throws InterruptedException {
		ProducerConsumer pc = new ProducerConsumer();

		Thread t1 = new Thread(() -> {
			try {
				pc.produce();
			} catch (Exception e) {
			}
		});
		Thread t2 = new Thread(() -> {
			try {
				pc.consume();
			} catch (Exception e) {
			}
		});
		t1.start();
		t2.start();
	

	}
}

class ProducerConsumer {
	private final int CAPACITY = 5;

	LinkedList<Integer> list = new LinkedList<Integer>();

	public void produce() throws InterruptedException {
		int value = 0;
		while (true) {
			synchronized (this) {
				if (list.size() == CAPACITY) {
					wait();
				}
				System.out.println("Produced: " + value);
				list.add(value++);
				notify();
				Thread.sleep(5000);
			}
		}
	}

	public void consume() throws InterruptedException {
		while (true) {
			synchronized (this) {
				if (list.size() == 0) {
					wait();
				}
				int val = list.remove(0);
				System.out.println("Consumed: " + val);
				notify();
				Thread.sleep(5000);
			}
		}
	}

}
