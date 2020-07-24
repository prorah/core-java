package com.fis.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeSerializationTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee emp=new Employee("a",26);
		FileOutputStream fos=new FileOutputStream("D:/Serialization.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(emp);
		oos.close();
		
		FileInputStream fis=new FileInputStream("D:/Serialization.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee emp1=(Employee)ois.readObject();
		System.out.println(emp1);
		ois.close();

	}

}
