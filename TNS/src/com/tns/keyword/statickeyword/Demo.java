package com.tns.keyword.statickeyword;

class Student{
	static String dept = "ECE";
	String name;
	
	static void disp() {
		System.out.println("Hello");
	}
}

public class Demo {
	
	static {
		System.out.println("welcome to IFET College Of Engineering");
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		
		Student.disp();
		
		s1.name = "Alwin donald";
		System.out.println(s1.name+"\n"+s1.dept);
		
		Student.disp();
		Student s2 = new Student();
		Student.dept = "AIDS";
		s2.name = "mani";
		System.out.println(s2.name+"\n"+s2.dept);
	

	}

}
