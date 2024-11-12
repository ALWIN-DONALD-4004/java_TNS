package com.tnsif.abstruction;

public class ShapeExecuter {

	public static void main(String[] args) {
		
		       // Create a Circle object with a specific radius
		        Circle circle = new Circle(0.1f);
		        Rectangle rectangle = new Rectangle(12.0f,34.1f);
		        Square square = new Square(25f);

		        // Call the getArea method to calculate and display the area
		        circle.getArea();
		        
		        rectangle.getArea();
		        
		        square.getArea();
		   
		}
	}

