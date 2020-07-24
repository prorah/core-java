package com.corejava.cloning;

public class Man implements Cloneable {
	private int age;
	private Human human;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Human getHuman() {
		return human;
	}

	public void setHuman(Human human) {
		this.human = human;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Man man = new Man();
		man.setAge(this.age);
		man.setHuman((Human) this.human.clone());
		return man;
	}

	@Override
	public String toString() {
		return "Man [age=" + age + ", human=" + human + "]";
	}

}
