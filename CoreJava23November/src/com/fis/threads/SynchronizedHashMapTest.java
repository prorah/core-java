package com.fis.threads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedHashMapTest {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		Map<String, Integer> syncMap = Collections.synchronizedMap(map);
		Thread t1 = new Thread(new MapImpl(syncMap, "A", 1));
		t1.start();
		Thread t2 = new Thread(new MapImpl(syncMap, "B", 2));
		t2.start();
		Thread t3 = new Thread(new MapImpl(syncMap, "C", 3));
		t3.start();
		Thread t4 = new Thread(new MapImpl(syncMap, "D", 4));
		t4.start();
		Thread t5 = new Thread(new MapImpl(syncMap, "E", 5));
		t5.start();
		Thread t6 = new Thread(new MapImpl(syncMap, "F", 6));
		t6.start();
	}
}

class MapImpl implements Runnable {
	private Map<String, Integer> map;
	private String key;
	private Integer value;

	public MapImpl(Map<String, Integer> map, String key, Integer value) {
		super();
		this.map = map;
		this.key = key;
		this.value = value;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(5000);
			System.out.println("Inserting key: " + key);
			System.out.println(map.size());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		map.put(key, value);
	}
}
