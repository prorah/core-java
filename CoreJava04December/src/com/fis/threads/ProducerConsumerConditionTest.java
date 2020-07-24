package com.fis.threads;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

//Producer Consumer problem using Condition Interface
public class ProducerConsumerConditionTest {

	public static void main(String[] args) throws InterruptedException {
		ProducerConsumerCondition pc = new ProducerConsumerCondition();

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

class ProducerConsumerCondition {
	private List<Integer> taskList = new LinkedList<>();
	int capacity = 5;
	// Lock is an interface
	private ReentrantLock lock = new ReentrantLock();
	//Condition is an interface
	private Condition condition = lock.newCondition();

	public void produce() throws InterruptedException {
		int value = 0;
		while (true) {
			lock.lock();
			System.out.println("Count from Producer: "+lock.getHoldCount()); //prints the number of times lock.lock() is invoked.
			if (taskList.size() == capacity) {
				condition.await();
			}
			System.out.println("Produced value:" + value);
			taskList.add(value++);
			condition.signal();
			Thread.sleep(2000);
			lock.unlock();
		}
	}

	public void consume() throws InterruptedException {
		while (true) {
			lock.lock();
			System.out.println("Count from Consumer: "+lock.getHoldCount());
			if (taskList.size() == 0) {
				condition.await();
			}
			System.out.println("Consumed Value: " + taskList.get(0));
			taskList.remove(0);
			condition.signal();
			Thread.sleep(2000);
			lock.unlock();
		}
	}

}
