package com.mannindia.Multithreading;

import java.util.ArrayList;
import java.util.List;

//This class demonstrates the Object class methods wait,notify and notifyAll
public class ThreadTest {

	public static void main(String[] args) {

		List<Integer> taskQueue = new ArrayList<Integer>();
		int MAX_CAPACITY = 5;
		Thread tProducer = new Thread(new ProducerObject(taskQueue, MAX_CAPACITY),
				"Producer");
		Thread tConsumer = new Thread(new ConsumerObject(taskQueue), "Consumer");
		tProducer.start();
		tConsumer.start();
	}

}
