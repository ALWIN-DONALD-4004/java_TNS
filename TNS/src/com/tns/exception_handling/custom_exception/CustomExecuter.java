package com.tns.exception_handling.custom_exception;

import java.util.Scanner;

@SuppressWarnings("serial")
class NotValidException extends Exception{
	public NotValidException(String s) {
		super(s);
	}
}

public class CustomExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		try {
			int age = sc.nextInt();
			if(age<18) {
				throw new NotValidException("you age should be greater than 18");
			}
		}
		catch(NotValidException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			sc.close();
		}
		
		System.out.println("program executed successfully");

	}

}
