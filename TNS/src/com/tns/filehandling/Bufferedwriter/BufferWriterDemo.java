package com.tns.filehandling.Bufferedwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWriterDemo {
	
	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("output.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("hey man");
			bw.newLine();
			bw.write("okey");
			bw.close();
			System.out.println("success");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}