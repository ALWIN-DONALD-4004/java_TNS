package com.pvr.shopping;

import com.pvr.shopping.entity.Customer;
import com.pvr.shopping.impl_ording.ComputerTools;
import com.pvr.shopping.impl_ording.MobileTools;
import com.pvr.shopping.interfacesample.Order;

public class ShoppingDemo {
	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		c1.setCid(101);
		c1.setCname("alwin");
		c1.setCity("villupuram");
		c1.setProduct("computertools");
		
		
		Order order;
		
		String choice = c1.getProduct();
		if(choice.equals("mobiletools")) {
			order = MobileTools.getMobiletools();
		}
		else {
			order = ComputerTools.getComputertools();
		}
		
		order.ordering();
		System.out.println(c1);
	}

}
