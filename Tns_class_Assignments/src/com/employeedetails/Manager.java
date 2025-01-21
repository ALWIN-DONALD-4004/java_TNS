package com.employeedetails;

public class Manager  extends Employee{
	 private double bonus;

	    // Constructor
	    public Manager(int employeeId, String name, double salary, double bonus) {
	        super(employeeId, name, salary);
	        this.bonus = bonus;
	    }

	    // Getter and Setter for bonus
	    public double getBonus() {
	        return bonus;
	    }

	    public void setBonus(double bonus) {
	        this.bonus = bonus;
	    }

	    @Override
	    public void displayDetails() {
	        super.displayDetails();
	        System.out.println("Bonus: " + bonus);
	    }

}
