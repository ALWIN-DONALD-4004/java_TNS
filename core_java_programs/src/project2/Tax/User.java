package project2.Tax;

public class User {
	
	private String name;
	private int age;
	private int Income;
	private String gender;
	private int tax;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getIncome() {
		return Income;
	}
	
	public void setIncome(int income) {
		Income = income;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return "Name : " + name + "\nAge : "+age + "\nGender : " + gender + "\nIncome : " + Income + "\nTax " + tax;
	}
	
	
	
}
