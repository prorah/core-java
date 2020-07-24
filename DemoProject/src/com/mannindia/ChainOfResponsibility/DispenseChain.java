package com.mannindia.ChainOfResponsibility;

public interface DispenseChain {

	void setNextChain(DispenseChain chain);

	void dispense(Currency cur);

}
