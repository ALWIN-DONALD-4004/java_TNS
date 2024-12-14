package com.alwindonald.assignment.employees;

public class Developer extends Employee {

	private String role;
	private String skills;

	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}

	
	public String toString() {
		return "Name         : " + getName()  + "\n" + 
			   "Employee ID  : " + getEmployeeId() + "\n" + 
			   "Salary       : " + getSalary() + " \n" +
			   "Role         : " + getRole() + " \n" +
			   "Skills       : " + getSkills();
	}
	
	
	
}
