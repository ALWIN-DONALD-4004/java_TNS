package com.tns.filehandling.Bufferedwriter;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("output.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
				
				br.close();
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
