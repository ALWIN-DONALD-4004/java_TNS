package com.tnsif.abstruction;

public abstract class Shape {
	protected float area;
	
	//abstract method
	abstract void getArea() ;
	
	//concrete method
	void show() {
		System.out.printf("Area of the shape is %.2f \n",area);
	}
}
