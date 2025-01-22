package com.tns.keyword.thiskeyword;

public class Student {
	
	int marks ;
	String name;
	
	Student(int a , String b){
		marks = a;
		name = b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student n1 = new Student(80, "Alwin");
		Student n2 = new Student(81, "Chan");
		System.out.println(n1.name );
		System.out.println(n2.name);
	}

}
