package com.corejava.programs;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerBlockingQueueTest {

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
	BlockingQueue<String> queue = new ArrayBlockingQueue<String>(3);

	public void produce() throws InterruptedException {
		int value = 0;
		while (true) {
				queue.put(String.valueOf(value++));
				System.out.println("Produced :" + value);
				Thread.sleep(2000);
		}
	}
	public void consume() throws InterruptedException {
		while (true) {
				String out=queue.take();
				System.out.println("Consumed :" + out);
				Thread.sleep(2000);
		}
	}
}
