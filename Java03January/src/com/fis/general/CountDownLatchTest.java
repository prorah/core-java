package com.fis.general;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {

	public static void main(String[] args) {

	}

}

class Restaurant implements Runnable {
	private CountDownLatch latch;
	private String[] items;

	public Restaurant(CountDownLatch latch, String[] items) {
		super();
		this.latch = latch;
		this.items = items;
	}

	@Override
	public void run() {

	}

}
