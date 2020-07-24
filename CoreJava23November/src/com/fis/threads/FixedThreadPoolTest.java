package com.fis.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//This program demonstrates FixedThreadPool
public class FixedThreadPoolTest {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(5); //define the pool size as 5 i.e. there will be 5 threads working on 100 tasks.
		for(int i=0;i<100;i++){
			service.execute(new Task());
		}
	}
}

class Task implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
