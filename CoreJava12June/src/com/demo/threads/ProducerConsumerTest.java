package com.demo.threads;

import java.util.LinkedList;

public class ProducerConsumerTest {
	public static void main(String[] args) throws InterruptedException {
		ProducerConsumer pc = new ProducerConsumer();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					pc.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					pc.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();
	}
}

class ProducerConsumer {
	int capacity = 5;
	LinkedList<Integer> list = new LinkedList<>();

	void produce() throws InterruptedException {
		int value = 0;
		while (true) {
			synchronized (this) {
				if (list.size() == capacity) {
					wait();
				}
				System.out.println("Produced Value: " + value);
				list.add(value++);
				notify();
				Thread.sleep(5000);
			}
		}
	}

	void consume() throws InterruptedException {
		while (true) {
			synchronized (this) {
				if (list.size() == 0) {
					wait();
				}
				int val = list.removeFirst();
				System.out.println("Consumed Value: " + val);
				notify();
				Thread.sleep(5000);
			}
		}
	}

}
