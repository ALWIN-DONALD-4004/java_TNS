package com.tns.AssignmentFour;

public abstract class Account {
	
	protected float balance;

    public Account(float balance) {
    	this.balance = balance;
	}
	public abstract void deposit(float amount);
    public abstract void withdraw(float amount);
   public abstract float getBalance();

    // Concrete method for displaying balance
     public void show() {
        System.out.println("Current Balance: " + getBalance());
    }
}
