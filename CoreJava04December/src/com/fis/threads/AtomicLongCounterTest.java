package com.fis.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

//This class demonstrates the count of tasks executed using Atomic Long
public class AtomicLongCounterTest {

	public static void main(String[] args) {
		AtomicLong counter = new AtomicLong();
		ExecutorService service = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 100; i++) {
			service.submit(new Task(counter));
		}
		System.out.println("Number of task executed:" + counter.get());
	}

}

class Task implements Runnable {
	private final AtomicLong counter;

	public Task(AtomicLong counter) {
		super();
		this.counter = counter;
	}

	@Override
	public void run() {
		counter.incrementAndGet();
	}

}
