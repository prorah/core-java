package com.corejava.threads;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {

	public static void main(String[] args) {
		CyclicBarrier barrier = new CyclicBarrier(2);
		Thread t1 = new Thread(new CabService(barrier, "passenger1"));
		t1.start();
		Thread t2 = new Thread(new CabService(barrier, "passenger2"));
		t2.start();
		Thread t3 = new Thread(new CabService(barrier, "passenger3"));
		t3.start();
		Thread t4 = new Thread(new CabService(barrier, "passenger4"));
		t4.start();
		Thread t5 = new Thread(new CabService(barrier, "passenger5"));
		t5.start();
		Thread t6 = new Thread(new CabService(barrier, "passenger6"));
		t6.start();

	}

}

class CabService implements Runnable {
	private CyclicBarrier barrier;
	private String passenger;

	public CabService(CyclicBarrier barrier, String passenger) {
		super();
		this.barrier = barrier;
		this.passenger = passenger;
	}

	@Override
	public void run() {
		System.out.println(passenger + " has arrived");

		try {
			barrier.await();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}

		System.out.println(passenger + " has boarded");

	}

}
