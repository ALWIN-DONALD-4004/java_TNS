package com.tns.keyword.thiskeyword;

public class Teacher {
	
	String myname;
	
	Teacher() {
		System.out.println("HELLO ........");
	}
	
	
	void setName(String myname) {
		this.myname = myname;
		
		//this represent to the current object in a method 
	}

	public static void main(String[] args) {
		
		Teacher t1 = new Teacher();
		t1.setName("Alwin");
		System.out.println(t1.myname);

	}

}
