package com.corejava.cloning;

import java.util.Map;

public class StudentCloningCollection implements Cloneable {
	private String name;
	private int age;
	private Map<String, String> addressMap;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Map<String, String> getAddressMap() {
		return addressMap;
	}

	public void setAddressMap(Map<String, String> addressMap) {
		this.addressMap = addressMap;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "StudentCloningCollection [name=" + name + ", age=" + age + ", addressMap=" + addressMap + "]";
	}

}
