package com.tns.AssignmentFour;


public class SavingsAccount extends Account {

	    public SavingsAccount(float balance) {
	        super(balance);
	    }

	    // Implement deposit method
	    
	    public void deposit(float amount) {
	        balance += amount;
	    }

	    // Implement withdraw method
	    
	    public void withdraw(float amount) {
	        if (balance >= amount) {
	            balance -= amount;
	        } else {
	            System.out.println("Insufficient funds!");
	        }
	    }

	    // Implement getBalance method
	   
	    public float getBalance() {
	        return balance;
	    }

}


