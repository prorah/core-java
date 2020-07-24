package com.self.corejava;

//This class demonstrates class level and object level locking
//For object level locking, Thread t1 and t2 cannot access the synchronized block at the same time. Either of t1/t2 and t3 can access.
//For Class level locking, none of the threads can access the synchronized block at the same time. Either of t1/t2/t3 can access.
public class ObjectClassLevelLockTest {

	public static void main(String[] args) {
		TestLocks b1 = new TestLocks();
		TestLocks b2 = new TestLocks();

		Thread t1 = new Thread(b1);

		Thread t2 = new Thread(b1);

		Thread t3 = new Thread(b2);
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		t1.start();
		t2.start();
		t3.start();

	}

}

class TestLocks implements Runnable {

	@Override
	public void run() {
		try {
			testMethod();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static synchronized void testMethod() throws InterruptedException {
		System.out.println("Start:" + Thread.currentThread().getName());

		Thread.sleep(2000);

		System.out.println("End:" + Thread.currentThread().getName());
	}

}
