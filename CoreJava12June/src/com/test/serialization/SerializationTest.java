package com.test.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*Employee emp = new Employee(1, 1, "rahul");
		FileOutputStream fos = new FileOutputStream("D:/serialization.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
		oos.close();
		System.out.println(emp.toString());*/

		FileInputStream fis = new FileInputStream("D:/serialization.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp1 = (Employee) ois.readObject();
		ois.close();
		System.out.println(emp1.toString());

	}

}
