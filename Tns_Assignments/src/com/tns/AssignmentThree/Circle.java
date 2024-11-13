package com.tns.AssignmentThree;
import java.util.*;
public class Circle {
	
		private double radius;
		private String colour;
		
		public void getInput() {
			Scanner sc  = new Scanner(System.in);
			System.out.print("Enter the radius of the circle : ");
			radius = sc.nextDouble();
			
			System.out.print("Enter the colour of the circle : ");
			colour = sc.next();
			
			sc.close();
		}
		
		public void calcArea() {
			double area = 3.14 * radius * radius;
			System.out.printf("The Radius of the circle is : %.2f %n" , radius);
			System.out.println("The Colour of the circle is : "+ colour);
	        System.out.printf("The area of the circle is   : %.2f ", area);
		}

		public static void main(String[] args) {
			Circle c1 = new Circle();
			c1.getInput();
			System.out.println();
			c1.calcArea();
		}
}