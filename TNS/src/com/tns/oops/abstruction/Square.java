package com.tns.oops.abstruction;

public class Square extends Shape {
	private float length;
	
	public Square(float length) {
		this.length = length;
	}
	
	void getArea() {
		area = length*length;
		show();
	}
     
}
