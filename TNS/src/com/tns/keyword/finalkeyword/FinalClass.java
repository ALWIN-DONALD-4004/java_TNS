package com.tns.keyword.finalkeyword;


final class Student{
	void hello() {
		System.out.println("hello");
	}
}

//we can't extends the class

//class B extends Student{
//
//}

public class FinalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.hello();
}
}

