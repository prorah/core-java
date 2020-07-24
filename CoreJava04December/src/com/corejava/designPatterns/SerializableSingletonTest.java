package com.corejava.designPatterns;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableSingletonTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fos = new FileOutputStream("D:/serialization.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		System.out.println(SingletonDesignPattern.getInstance().hashCode());
		oos.writeObject(SingletonDesignPattern.getInstance());
		FileInputStream fis = new FileInputStream("D:/serialization.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		SingletonDesignPattern outObject = (SingletonDesignPattern) ois.readObject();
		System.out.println(outObject.hashCode());

	}

}
