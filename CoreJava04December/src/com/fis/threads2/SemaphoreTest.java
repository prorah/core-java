package com.fis.threads2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

//This class demonstrates the concept of Semaphores.
public class SemaphoreTest {

	public static void main(String[] args) {
		Semaphore semaphore = new Semaphore(2);
		ExecutorService service = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			service.submit(new TaskNew(semaphore));
		}
	}

}

class TaskNew implements Runnable {
	private Semaphore semaphore;

	public TaskNew(Semaphore semaphore) {
		super();
		this.semaphore = semaphore;
	}

	@Override
	public void run() {
		try {
			semaphore.acquire();
			Thread.sleep(2000);
			System.out.println("Task is running");
			semaphore.release();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
