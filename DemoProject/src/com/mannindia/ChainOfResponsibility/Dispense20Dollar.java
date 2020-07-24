package com.mannindia.ChainOfResponsibility;

public class Dispense20Dollar implements DispenseChain {

	private DispenseChain chain;

	@Override
	public void setNextChain(DispenseChain chain) {
		this.chain = chain;

	}

	@Override
	public void dispense(Currency cur) {
		if (cur.getAmount() >= 20) {
			int num = cur.getAmount() / 20;
			int remainder = cur.getAmount() % 20;
			System.out.println("Dispensing " + num + " 20$ note");
			if (remainder != 0)
				this.chain.dispense(new Currency(remainder));
		} else {
			this.chain.dispense(cur);
		}
	}

}
