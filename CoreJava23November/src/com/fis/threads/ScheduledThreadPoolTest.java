package com.fis.threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//This program demonstrates ScheduledThreadPoolTest
public class ScheduledThreadPoolTest {

	public static void main(String[] args) {
		ScheduledExecutorService service = Executors.newScheduledThreadPool(5);

		// Task to run after delay of 10 seconds
		service.schedule(new TaskNew(), 10, TimeUnit.SECONDS);

		// Task to run repeatedly after 10s
		service.scheduleAtFixedRate(new TaskNew(), 15, 10, TimeUnit.SECONDS);

		// Task to run repeatedly every 10s after the previous task completes.
		service.scheduleWithFixedDelay(new TaskNew(), 15, 10, TimeUnit.SECONDS);
	}

}

class TaskNew implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}