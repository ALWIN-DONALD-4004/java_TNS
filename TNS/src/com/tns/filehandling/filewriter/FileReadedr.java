package com.tns.filehandling.filewriter;

import java.io.FileReader;

public class FileReadedr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("output.txt");
			int c = fr.read();
			while(c !=-1) {
				System.out.print((char)c);
				c = fr.read();
				
				fr.close();
			}
		}
		catch (Exception e) {
			
		}
	}

}
