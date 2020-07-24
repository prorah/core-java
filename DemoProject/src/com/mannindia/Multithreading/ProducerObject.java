package com.mannindia.Multithreading;

import java.util.List;

public class ProducerObject implements Runnable {
	private final List<Integer> taskQueue;
	private final int MAX_CAPACITY;

	public ProducerObject(List<Integer> taskQueue, int size) {
		this.taskQueue = taskQueue;
		this.MAX_CAPACITY = size;
	}

	@Override
	public void run() {
		int counter = 0;
		while (true) {
			try {
				produce(counter++);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

	private void produce(int i) throws InterruptedException {
		synchronized (taskQueue) {
			while (taskQueue.size() == MAX_CAPACITY) {
				System.out.println("Queue is full "
						+ Thread.currentThread().getName()
						+ " is waiting , size: " + taskQueue.size());
				taskQueue.wait();
			}

			Thread.sleep(10000);
			taskQueue.add(i);
			System.out.println("Produced: " + i);
			taskQueue.notifyAll();
		}
	}
}
