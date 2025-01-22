package com.tns.exception_handling.usefinally;

public class FinallyExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int err=0;
		try {
			@SuppressWarnings("unused")
			int a = 10/0;
//			int a = 10;
			err = 0;
		}
		
		catch(Exception e){
			System.out.println(e);
			err = 1;
		}
		
		finally {
			if(err == 0) {
				System.out.println("no error");
			}
			else {
				System.out.println("error");
			}
		}

	}

}
