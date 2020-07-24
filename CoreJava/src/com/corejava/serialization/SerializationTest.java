package com.corejava.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// code for serialization
		EmployeeSerialization emp = new EmployeeSerialization("rahul", 26, 10, null);
		FileOutputStream fos = new FileOutputStream("D:/serialization.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
		fos.close();
		System.out.println("Serialization:" + emp);

		// code for deserialization
		EmployeeSerialization empNew = null;
		FileInputStream fis = new FileInputStream("D:/serialization.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		empNew = (EmployeeSerialization) ois.readObject();
		fis.close();
		System.out.println("Deserialization" + empNew);

	}
}
