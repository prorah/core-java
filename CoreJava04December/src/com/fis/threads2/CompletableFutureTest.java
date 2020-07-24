package com.fis.threads2;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture future=CompletableFuture.supplyAsync(()->{return "A";}).thenApply(name ->"Hello " + name);
		System.out.println(future.get());
	}

}
