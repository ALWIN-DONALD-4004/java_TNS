package com.tns.filehandling.filewriter;

import java.io.FileWriter;

public class FileWriterDemo {
	
	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("output.txt",true);
//			fw.write("Hello, World");
			fw.append(" by alwin donald");
			fw.close();
			System.out.println("success");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
