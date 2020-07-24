package com.corejava.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GenerateParser {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:/tags.txt");
		FileWriter fw = new FileWriter("D:/outputparser.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		BufferedReader br = new BufferedReader(fr);
		int i=1;
		while (br.readLine() != null) {
			System.out.println(i);
			System.out.println(br.readLine());
			bw.write("<staxelement id=\"\"");
			bw.newLine();
			bw.write("classname=\"com.clear2pay.bph.opfcommon.parsing.xml.SimpleElement\"");
			bw.newLine();
			bw.write("targetkey=\"\"");
			bw.newLine();
			bw.write("element=\"" + br.readLine() + "\"/>");
			bw.newLine();
			bw.newLine();
			i++;
			bw.flush();
		}
	}
}
