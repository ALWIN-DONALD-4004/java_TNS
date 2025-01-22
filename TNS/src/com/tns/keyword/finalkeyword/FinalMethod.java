package com.tns.keyword.finalkeyword;

class A{
	final void hello() {
		System.out.println("hello");
	}
}

//we can't override the method

class B extends A{
//	void hello() {
//		System.out.println("hi");
//	}
}

public class FinalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b1 = new B();
		b1.hello();
	}

}
