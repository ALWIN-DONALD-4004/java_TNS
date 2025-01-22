package com.tns.exception_handling.usethrow;

import java.util.Scanner;

public class ThrowExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		try {
			int age = sc.nextInt();
			if(age<=0) {
				throw new ArithmeticException("age should be greater than one");
			}
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		finally {
			sc.close();
		}
		
		System.out.println("program ended successfully");

	}

}
