package com.self.corejava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//This class demonstrates that for final and transient variables, the default value does not get serialized to stream. The value given when
//the variable is initialized gets saved to the file.
public class SerializationFinalTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*SerializationFinal objectA = new SerializationFinal("A");
		FileOutputStream fos = new FileOutputStream("D:/serialization.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(objectA);
		System.out.println(objectA);*/

		FileInputStream fis = new FileInputStream("D:/serialization.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		SerializationFinal objectB = (SerializationFinal) ois.readObject();
		System.out.println(objectB);

	}

}
