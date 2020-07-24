package com.mannindia.demo;

public class Frog {
	 static int frogSize = 0;

	public int getFrogSize() {
		return frogSize;
	}

	Frog(int s) {
		frogSize += s;
	}
}
