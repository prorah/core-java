package com.corejava.oopsConcepts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.corejava.externalization.EmployeeExternalization;

public class ExternalizationTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// code for serialization
		EmployeeExternalization emp = new EmployeeExternalization();
		emp.setName("rahul");
		emp.setAge(10);
		FileOutputStream fos = new FileOutputStream("D:/serialization.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
		fos.close();
		System.out.println("serialization:" + emp);

		// code for deserialization
		EmployeeExternalization empNew = null;
		FileInputStream fis = new FileInputStream("D:/serialization.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		empNew = (EmployeeExternalization) ois.readObject();
		fis.close();
		System.out.println("Deserialization:" + empNew);
	}

}
