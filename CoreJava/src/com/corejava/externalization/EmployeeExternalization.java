package com.corejava.externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

//Externalization uses the no-arg constructor
public class EmployeeExternalization implements Externalizable {
	private String name;
	private int age;

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
		// read only first three letters in name property
		name = name.substring(0, 3);
		age = in.readInt();
		// deduct 20 from age
		age = age - 20;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject("abc" + name);
		out.writeInt(age + 10);
	}

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

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}

}
