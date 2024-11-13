package com.tns.AssignmentTwo;

import java.util.*;

public class CommissionExecuter {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name of the Sales Employee: ");
		String name = sc.nextLine();
		System.out.println("Enter the Address of the Sales Employee: ");
		String address = sc.nextLine();
		System.out.println("Enter the Phone Number of the Sales Employee: ");
		long phone = sc.nextLong();
		System.out.println("Enter the Sales Amount: ");
		float sales_amount = sc.nextFloat();
		
		Commission commission = new Commission(name, address, phone, sales_amount);
		commission.calcualteCommission();
		
		sc.close();
	}
}