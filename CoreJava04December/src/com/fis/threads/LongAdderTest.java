package com.fis.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAdder;

//This class demonstrates the count of tasks executed using Long Adder. Long Adder is better than Atomic Long because it reduces the overhead
//of flush and refresh operations involved with Atomic Long.
public class LongAdderTest {

	public static void main(String[] args) {
		LongAdder counter = new LongAdder();
		ExecutorService service = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 100; i++) {
			service.submit(new TaskNew(counter));
		}
		System.out.println("Number of task executed:" + counter.sum());
	}

}

class TaskNew implements Runnable {
	private LongAdder counter;

	public TaskNew(LongAdder counter) {
		super();
		this.counter = counter;
	}

	@Override
	public void run() {
		counter.increment();
	}

}
