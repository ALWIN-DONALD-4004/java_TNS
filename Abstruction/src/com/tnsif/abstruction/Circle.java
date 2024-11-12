package com.tnsif.abstruction;


public class Circle extends Shape {
	private float radius;

	public Circle(float radius) {
		this.radius = radius;
	}


	void getArea() {
		area = (float) (Math.PI * radius * radius);
		show();
	}
}
