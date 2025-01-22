package com.tns.exception_handling.tryandcatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tryExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		try {
			@SuppressWarnings("unused")
			int x = sc.nextInt();
			@SuppressWarnings("unused")
			int y = 10;
		}
//		catch(Exception e) {
////			System.out.println(e);
//			System.out.println("Exception handled");
//		}
		
		catch(InputMismatchException e) {
			System.out.println(e);
		}
		catch(ArithmeticException e1) {
			System.out.println(e1);
		}
		
		System.out.println("program completle executed ......");
		
		sc.close();
	}

}
