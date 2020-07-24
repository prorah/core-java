package com.corejava.oopsConcepts;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//This class demonstrates writing and reading data to/from a file
public class FileReadWriteTest {
	public static void main(String[] args) throws IOException {
		File file = new File("D:/serialization.txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("rahul");
		bw.newLine();
		bw.write("rajput");
		bw.flush();
		bw.close();

		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String s;
		while ((s=br.readLine()) != null) {
			System.out.println(s);
		}
		br.close();
	}

}
