package com.demo.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*SingletonTest instance1 = SingletonTest.getInstance();
		System.out.println(instance1.hashCode());
		FileOutputStream fos = new FileOutputStream("D:/a.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(instance1);*/
		
		FileInputStream fis=new FileInputStream("D:/a.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		SingletonTest instance2=(SingletonTest)ois.readObject();
		System.out.println(instance2.hashCode());
	}

}
