package com.tns.AssignmentTwo;

public class Commission {
	String Name;
	String Address;
	long Phone;
	float Sales_amount;
	
	Commission (String name, String address, long phone, float sales_amount) {
		this.Name = name;
		this.Address = address;
		this.Phone = phone;
		this.Sales_amount = sales_amount;
	}
	
	public void calcualteCommission() {
		if (Sales_amount >= 100000) {
			System.out.println("Commission: 10%");
		}
		else if (Sales_amount >= 50000 && Sales_amount < 100000) {
			System.out.println("Commission: 5%");
		}
		else if (Sales_amount >= 30000 && Sales_amount < 50000) {
			System.out.println("Commission: 3%");
		}
		else {
			System.out.println("No Commission");
		}
	}
	
}
