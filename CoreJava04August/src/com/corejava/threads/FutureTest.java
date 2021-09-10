package com.corejava.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newFixedThreadPool(5);

		Future<Integer> future = service.submit(new Task());
		System.out.println(future.isDone());
		Integer result = future.get();
		System.out.println(future.isDone());

		System.out.println("Result: " + result);
	}
}

class Task implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		System.out.println(Thread.currentThread().getName());
		Thread.sleep(5000);
		return 5;
	}

}
