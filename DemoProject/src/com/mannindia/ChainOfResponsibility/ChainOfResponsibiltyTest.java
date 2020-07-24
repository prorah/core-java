package com.mannindia.ChainOfResponsibility;

import java.util.Scanner;

public class ChainOfResponsibiltyTest {
	private DispenseChain c1;

	public ChainOfResponsibiltyTest() {
		super();
	}

	public ChainOfResponsibiltyTest(DispenseChain c1) {
		// initialize the chain
		c1 = new Dispense50Dollar();
		DispenseChain c2 = new Dispense20Dollar();

		// set chaining
		c1.setNextChain(c2);
	}

	public static void main(String[] args) {
		ChainOfResponsibiltyTest atmDispenser = new ChainOfResponsibiltyTest();
		while (true) {
			int amount = 0;
			System.out.println("Enter amount to dispense");
			Scanner input = new Scanner(System.in);
			amount = input.nextInt();
			if (amount % 10 != 0) {
				System.out.println("Amount should be in multiple of 10s.");
				return;
			}
			// process the request
			atmDispenser.c1.dispense(new Currency(amount));
		}

	}

}
