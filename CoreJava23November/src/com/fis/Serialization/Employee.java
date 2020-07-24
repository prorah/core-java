package com.fis.Serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//This class demonstrates custom serialization and deserialization in java
//The sequence of class attributes in custom read and write attributes must be the same.
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;

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

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " " + age;
	}

	// called after deserialization process before the object is handed over
	/*
	 * public Object readResolve() { return new Employee("b", 27); }
	 */

	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.writeUTF(name + "custom write method");
		oos.writeInt(age + 12);
	}

	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		name = ois.readUTF();
		age = ois.readInt();
	}
}
