package com.tns.coreConcepts.constructor;

public class ParameterizedConstructor {
	
	int marks ;
	String name;
	
	ParameterizedConstructor(){
		System.out.println("hello");
	}
	
	ParameterizedConstructor(int a){
		System.out.println(a);
		System.out.println("NUmber");
	}
	
	
	
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		ParameterizedConstructor p1 = new ParameterizedConstructor();
		
		@SuppressWarnings("unused")
		ParameterizedConstructor p2 = new ParameterizedConstructor(10);
		
		
	}

}
