package com.tns.polymorphism.overriding;

public class OverridingExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rbi rbi;

//		Dynamic binding assigning child class object to parent class reference variable.
		rbi = new Sbi();
		System.out.println(rbi.getROI());

		rbi = new Icic();
		System.out.println(rbi.getROI());

		rbi = new Hdfc();
		System.out.println(rbi.getROI());

	}


}

