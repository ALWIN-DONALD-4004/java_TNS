package project2.Tax;

import java.util.*;

public class UserExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		User u1 = new User();
		
		
		System.out.print("Enter your Name : ");
		u1.setName(s.next());
		
		System.out.print("Enter your Age : ");
		u1.setAge(s.nextInt());
		
		System.out.print("Enter your Gender : ");
		u1.setGender(s.next());
		
		System.out.print("Enter your Income : ");
		u1.setIncome(s.nextInt());
		
		System.out.print(u1+"\n");
		
	    TaxCalc taxCalc = new TaxCalc();
	    taxCalc.calculateTax(u1);
	     
		System.out.println(u1);
		
	s.close();
		

	}

}
