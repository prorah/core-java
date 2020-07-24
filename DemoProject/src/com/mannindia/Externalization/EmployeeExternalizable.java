package com.mannindia.Externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class EmployeeExternalizable implements Externalizable {

	private int id;
	private String name;
	private int salary;

	public EmployeeExternalizable(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// No arg constructor is mandatory in case of Externalizable interface
	public EmployeeExternalizable() {
		super();
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// Here we can decide which member variables are to be serialized
		out.writeInt(id);
		out.writeObject("abc" + name);
		out.writeInt(salary);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		id = in.readInt();
		name = (String) in.readObject();
		if (!name.startsWith("abc"))
			throw new IOException("corrupted data");
		name = name.substring(3);
		salary = in.readInt();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
