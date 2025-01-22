package com.tns.exception_handling.tryandcatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int a = 0;
		int b = 0;
		int c = 0;
		try {
			a = sc.nextInt();
			b = sc.nextInt();
			c = a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("please enter the b value greater than 0");
		}
		
		catch(InputMismatchException e) {
			System.out.println("enter the input as integer");
		}
		if(c!=0) {
			System.out.println(c);
		}
		
		sc.close();
		
	}

}
