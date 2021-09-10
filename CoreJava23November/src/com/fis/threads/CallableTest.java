package com.fis.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//This class demonstrates Callable and Future
public class CallableTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newFixedThreadPool(3);
		Future<Integer> future = service.submit(new TaskCallable()); // immediately
																		// gives
																		// an
																		// empty
																		// placeholder.
		Integer result = future.get();// the placeholder gets a value.
		// the call to get blocks the main thread
		// until future gets a value from the
		// task.
		// There is also an overloaded version of get(1, TimeUnit.SECONDS) that
		// allow you to throw timeout exception if the value within the future
		// is not available within the specified time.
		System.out.println(result);
	}

}

class TaskCallable implements Callable<Integer> {
	@Override
	public Integer call() throws Exception {
		Thread.sleep(5000);
		return 5;
	}

}
