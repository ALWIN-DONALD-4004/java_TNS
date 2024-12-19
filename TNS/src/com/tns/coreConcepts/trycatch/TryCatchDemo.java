package com.tns.coreConcepts.trycatch;

public class TryCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("I am in main method"); 
		int result;
		
		result=TryCatchExample.performDivision(12,0);
		if (result!=0)
			System.out.println("Diviosin is "+result);
		
		System.out.println("------------------------------");
		
		result=TryCatchExample.performDivision(12,3);
		if (result!=0)
			System.out.println("Division is "+result);
		
		System.out.println("------------------------------");
		System.out.println(TryCatchExample.performDivision(12f, 5f));
		
		System.out.println("------------------------------");
		System.out.println(TryCatchExample.performDivision(12f, 0f));
		

	}

}
