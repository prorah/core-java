package com.mannindia.ChainOfResponsibility;

public class Dispense50Dollar implements DispenseChain {

	private DispenseChain chain;

	@Override
	public void setNextChain(DispenseChain chain) {

		this.chain = chain;
	}

	@Override
	public void dispense(Currency cur) {
		if (cur.getAmount() >= 50) {
			int num = cur.getAmount() / 50;
			int remainder = cur.getAmount() % 50;
			System.out.println("Dispensing " + num + " 50$ note");
			if (remainder != 0)
				this.chain.dispense(new Currency(remainder));
		} else {
			this.chain.dispense(cur);
		}
	}

}
