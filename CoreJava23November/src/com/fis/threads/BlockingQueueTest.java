package com.fis.threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

//This program demonstrates the Blocking Queue with a sample interview scheduler app. Here the examination hall can be treated as the queue. 
//From one end, the candidates enter the hall and go out for the interview from the other end.
public class BlockingQueueTest {

	public static void main(String[] args) {
		BlockingQueue<String> queue = new ArrayBlockingQueue<String>(3);// Instantiate
																		// an
																		// ArrayBlockingQueue
																		// of
																		// size
																		// 3
		InterviewScheduler scheduler = new InterviewScheduler(queue);
		InterviewProcessor processor = new InterviewProcessor(queue);
		new Thread(scheduler).start();
		new Thread(processor).start();
	}

}

class InterviewScheduler implements Runnable {
	BlockingQueue<String> queue;

	public InterviewScheduler(BlockingQueue<String> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		System.out.println("6 candidates have arrived for the interview");
		for (int i = 1; i < 7; i++) {
			try {
				queue.put("candidate" + i); // start inserting candidates in the
											// queue
				System.out.println("candidate " + i + " has arrived");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			queue.put("Stop"); // when all the candidates have been inserted in
								// the queue, insert Stop lastly.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class InterviewProcessor implements Runnable {
	BlockingQueue<String> queue;

	public InterviewProcessor(BlockingQueue<String> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		String msg;
		try {
			Thread.sleep(10000);
			while (!(msg = queue.take()).equals("Stop")) {
				Thread.sleep(10000);
				System.out.println(msg + " interview is done");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Interviews done for all the candidates");
	}

}
