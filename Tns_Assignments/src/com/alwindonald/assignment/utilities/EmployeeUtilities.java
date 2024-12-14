package com.alwindonald.assignment.utilities;

import java.util.Scanner;
import com.alwindonald.assignment.employees.Developer;
import com.alwindonald.assignment.employees.Manager;

public class EmployeeUtilities {
	
	//object to access the data from manager and developer class
	Developer d1 = new Developer();
	Manager m1 = new Manager();
	

	Scanner sc = new Scanner(System.in);
	
	
	//constructor  to get choice from user(manager (or) developer)
	public EmployeeUtilities(String choice) {
		
		if(choice.equals("developer")) {
			
			System.out.println("---------------DEVELOPER-------------");
			developerDetails();
			
			System.out.println("---------------Developer Details-------------" +"\n");
			printDeveloperDetails();
		}
		else if(choice.equals("manager")) {
			
			System.out.println("----------------MANAGER----------------");
			managerDetails();
			
			System.out.println("---------------Manager Details----------------"+"\n");
			printManagerDetails();
		}
		
		else {
			System.out.println("please, enter correct choice");
		}
	}
	 
	
	//method to Get Details from the user by instance of manager m1 object
	public void managerDetails() {
		
		System.out.print("Enter Name : ");
		m1.setName(sc.nextLine());
		
		System.out.print("Enter Employee ID :");
		m1.setEmployeeId(sc.next());
		
		System.out.print("Enter Salary : ");
		m1.setSalary(sc.nextInt());
		sc.nextLine();
		
		System.out.print("Enter your Position  : ");
		m1.setPosition(sc.nextLine());
		
		System.out.print("Enter Branch name : ");
		m1.setBranch(sc.next());
		
		System.out.println();
	
	}
	
	
	//method to Get Details from the user by instance of developer d1 object
	public void developerDetails() {
		
		System.out.print("Enter Name  : ");
		d1.setName(sc.nextLine());
		
		System.out.print("Enter your ID : ");
		d1.setEmployeeId(sc.next());
		
		System.out.print("Enter your salary  : ");
		d1.setSalary(sc.nextInt());
		sc.nextLine();
		
		System.out.print("Enter your Role : ");
		d1.setRole(sc.nextLine());
		
		System.out.print("Enter your Skill : ");
		d1.setSkills(sc.nextLine());
		 
		System.out.println();
	}
	
	
	//method to print the details of developer
	public void printDeveloperDetails() {
		System.out.println(d1);
	}
	
	
	//method to print the details of manager
	public void printManagerDetails() {
		System.out.println(m1);
	}
	   

}
