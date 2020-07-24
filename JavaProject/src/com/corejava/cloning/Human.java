package com.corejava.cloning;

public class Human implements Cloneable {
	private String gender;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Human human = new Human();
		human.setGender(this.gender);
		return human;
	}

	@Override
	public boolean equals(Object arg0) {
		return this.gender.equals(((Human) arg0).getGender());
	}

	public Human(String gender) {
		this.gender = gender;
	}

	public Human() {
	}

	/*@Override
	public int hashCode() {
		return gender.length();
	}*/

}
