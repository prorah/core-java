package com.fis.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//This program demonstrates FixedThreadPool
public class FixedThreadPoolTest {

	public static void main(String[] args) {
		ExecutorService service = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 3; i++) {
			service.execute(new Task(i));
		}
	}
}

class Task implements Runnable {
	int counter;

	Task(int counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		System.out.println(counter);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
