package com.alwindonald.assignment;
import java.util.Scanner;
import com.alwindonald.assignment.utilities.*;

public class AssignmentMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//get the choice from user to want developer or manager details
		System.out.print("enter the option , developer (or) manager  : ");
		
		//the constructor called from the EmployeeUtilities class
		new EmployeeUtilities(sc.next());
		

	}

}
