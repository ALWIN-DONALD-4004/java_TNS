package com.tns.coreConcepts.constructor;

public class DefaultConstruction {
	
	int marks ;
	String name;
	DefaultConstruction(){
//		marks = 10;
//		name = "alwin";
		
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultConstruction i1 =new DefaultConstruction();
		DefaultConstruction i2 = new DefaultConstruction();
		
		System.out.println(i2.name + "\n"+i1.marks);

	}

}
