package com.tns.exception_handling.usethrows;

class Calc{
	void div() throws Exception{
		@SuppressWarnings("unused")
		int a = 10/0;
	}
}

public class throwsExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calc c1 = new Calc();
		
//		c1.div();
		
		try {
			c1.div();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
