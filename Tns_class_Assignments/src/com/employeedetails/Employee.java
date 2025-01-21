package com.employeedetails;

public class Employee {
	  private int employeeId;
	    private String name;
	    private double salary;

	    // Constructor
	    public Employee(int employeeId, String name, double salary) {
	        this.employeeId = employeeId;
	        this.name = name;
	        this.salary = salary;
	    }

	    // Getter and Setter methods
	    public int getEmployeeId() {
	        return employeeId;
	    }

	    public void setEmployeeId(int employeeId) {
	        this.employeeId = employeeId;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) throws IllegalArgumentException {
	        if (salary < 0) {
	            throw new IllegalArgumentException("Salary cannot be negative.");
	        }
	        this.salary = salary;
	    }

	    // Method to display employee details
	    public void displayDetails() {
	        System.out.println("Employee ID: " + employeeId);
	        System.out.println("Name: " + name);
	        System.out.println("Salary: " + salary);
	    }

}
