package com.alwindonald.assignment.employees;

public class Manager extends Employee{
	
	public String position;
	public String Branch;
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public String getBranch() {
		return Branch;
	}

	public void setBranch(String branch) {
		this.Branch = branch;
	}

	public String getPosition() {
		return position;
	}
	
	public String toString() {
		return "Name         : " + getName()  + "\n" + 
			   "Employee ID  : " + getEmployeeId() + "\n" + 
			   "Salary       : " + getSalary() + " \n" +
			   "Position     : " + getPosition() + " \n" +
			   "Branch       : " + getBranch();
	}

}
