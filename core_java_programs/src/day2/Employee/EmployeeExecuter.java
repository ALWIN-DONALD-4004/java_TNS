package day2.Employee;

public class EmployeeExecuter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		e1.setId(4004);
		e1.setUsername("alwindonald");
		e1.setCity("villupuram");
		
		System.out.println("Id:"+e1.getId()+"\nUsername:"+e1.getUsername()+"\nCity:"+e1.getCity());
		
			
	}

}
