package com.tns.accessmodifiers.protectedmodefier.package_one;

import com.tns.accessmodifiers.protectedmodefier.package_two.Teacher;

public class Student extends Teacher{
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.tname);
	
	}
}
