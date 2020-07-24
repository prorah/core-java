package com.corejava.designPatterns;

//To demonstrate Builder Design Pattern
public class Computer {

	private int RAM;
	private int HDD;

	@Override
	public String toString() {
		return "Computer [RAM=" + RAM + ", HDD=" + HDD + ", bluetooth=" + bluetooth + ", graphicsCard=" + graphicsCard
				+ "]";
	}

	// optional parameters
	private boolean bluetooth;
	private boolean graphicsCard;

	public int getRAM() {
		return RAM;
	}

	public int getHDD() {
		return HDD;
	}

	public boolean isBluetooth() {
		return bluetooth;
	}

	public boolean isGraphicsCard() {
		return graphicsCard;
	}

	private Computer(ComputerBuilder builder) {
		this.RAM = builder.RAM;
		this.HDD = builder.HDD;
		this.bluetooth = builder.bluetooth;
		this.graphicsCard = builder.graphicsCard;
	}

	public static class ComputerBuilder {
		private int RAM;
		private int HDD;

		// optional parameters
		private boolean bluetooth;
		private boolean graphicsCard;

		public ComputerBuilder(int RAM, int HDD) {
			this.RAM = RAM;
			this.HDD = HDD;
		}

		public ComputerBuilder setBluetooth(boolean bluetooth) {
			this.bluetooth = bluetooth;
			return this;
		}

		public ComputerBuilder setGraphicsCard(boolean graphicsCard) {
			this.graphicsCard = graphicsCard;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}

	}
}
