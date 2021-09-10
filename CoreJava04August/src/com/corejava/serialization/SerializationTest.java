package com.corejava.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		/*ChildClass child = new ChildClass();
		child.c1=10;
		child.p1=12;
		FileOutputStream fos = new FileOutputStream("E:/serialization.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(child);
		System.out.println(child);*/

		FileInputStream fis = new FileInputStream("E:/serialization.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ChildClass child1 = (ChildClass) ois.readObject();
		System.out.println("c1:"+child1.c1+"|p1:"+child1.p1);

	}

}
