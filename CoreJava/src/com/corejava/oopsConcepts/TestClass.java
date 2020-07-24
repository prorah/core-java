package com.corejava.oopsConcepts;

public class TestClass {

	public static void main(String[] args) {
		int limit = 100;
		String[] currency = { "JOD", "SAR", "INR" };
		String[] amount = { "20", "100", "101", "1000", "200", "201", "2000", "500", "501", "5000", "600", "601" };
		constructPairs: for (int i = 0; i < limit; i++) {
			for (int j = 0; j < currency.length; j++) {
				for (int k = 0; k < amount.length; k++) {
					if (limit == k)
						break constructPairs;
					System.out.println(currency[j] + " " + amount[k]);
				}
			}
		}
	}
}
