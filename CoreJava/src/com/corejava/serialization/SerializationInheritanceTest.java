package com.corejava.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//Object class does not implement serializable interface in java
//When parent class does not implement the Serializable interface and Child class implements the Serializable interface, then during deserialization process
//the following sequence of events occur for Parent class
//1. Variable Initialization will be done.
//2. Instance block will be executed.
//3. No-argument constructor will be executed.
public class SerializationInheritanceTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Man man = new Man("male", 26, "rahul");

		// Serialization process
		FileOutputStream fos = new FileOutputStream("D:/serialization1.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		System.out.println(man);
		oos.writeObject(man);
		oos.close();

		// Deserialization Process
		FileInputStream fis = new FileInputStream("D:/serialization1.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Man man1 = (Man) ois.readObject();
		ois.close();
		System.out.println(man1);

	}

}
