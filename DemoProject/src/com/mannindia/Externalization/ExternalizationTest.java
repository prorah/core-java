package com.mannindia.Externalization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizationTest {

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		EmployeeExternalizable serializeEmployee = new EmployeeExternalizable(
				1, "rahul", 10000);
		String fileName = "/home/mannindia/serialization.txt";
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(serializeEmployee);
		System.out.println("Employee Object written to file");

		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		EmployeeExternalizable deserializeEmployee = (EmployeeExternalizable) ois
				.readObject();
		System.out.println("Employee name:" + deserializeEmployee.getName());
		System.out.println("Employee id:" + deserializeEmployee.getId());
		System.out
				.println("Employee salary:" + deserializeEmployee.getSalary());
	}

}
