package com.fis.threads;

import java.util.LinkedList;
import java.util.List;

public class ProducerConsumerTest {

	public static void main(String[] args) throws InterruptedException {
		ProducerConsumer pc = new ProducerConsumer();

		Thread t1 = new Thread(() -> {
			try {
				pc.produce();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		Thread t2 = new Thread(() -> {
			try {
				pc.consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		t1.start();
		t2.start();
	}

}

class ProducerConsumer {
	private List<Integer> taskList = new LinkedList<>();
	int capacity = 5;

	public void produce() throws InterruptedException {
		int value = 0;
		while (true) {
			synchronized (this) {
				if (taskList.size() == capacity) {
					wait();
				}
				System.out.println("Produced value:" + value);
				taskList.add(value++);
				notify();
				Thread.sleep(2000);
			}
		}
	}

	public void consume() throws InterruptedException {
		while (true) {
			synchronized (this) {
				if (taskList.size() == 0) {
					wait();
				}
				System.out.println("Consumed Value: " + taskList.get(0));
				taskList.remove(0);
				notify();
				Thread.sleep(2000);
			}
		}
	}

}
