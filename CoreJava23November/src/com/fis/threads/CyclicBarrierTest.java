package com.fis.threads;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

//This class demonstrates the concept of cyclic barrier in concurrency.
//This program demonstrates a cab boarding service wherein passengers arrive 
//to board the cab but can actually board when the number of passengers is 2.
public class CyclicBarrierTest {
	public static void main(String[] args) throws InterruptedException {
		CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
		CabService cabService = new CabService(cyclicBarrier);
		Thread t1 = new Thread(new CabService(cyclicBarrier));
		t1.setName("Passenger1");
		t1.start();
		Thread.sleep(5000);
		Thread t2 = new Thread(new CabService(cyclicBarrier), "Passenger2");
		t2.start();
		Thread.sleep(5000);
		Thread t3 = new Thread(new CabService(cyclicBarrier), "Passenger3");
		t3.start();
		Thread.sleep(5000);
		Thread t4 = new Thread(new CabService(cyclicBarrier), "Passenger4");
		t4.start();
		Thread.sleep(5000);
	}
}

class CabService implements Runnable {

	private CyclicBarrier cyclicBarrier;

	public CabService(CyclicBarrier cyclicBarrier) {
		super();
		this.cyclicBarrier = cyclicBarrier;
	}

	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " has arrived");
			cyclicBarrier.await();
			System.out.println(Thread.currentThread().getName() + " has boarded");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}

	}

}