package project2.student;

public class StudentExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		
		s1.setSid("421121104004");
		s1.setSname("Alwin Donald");
		s1.setCourse("B.E");
		s1.setStream("ECE");
		s1.setGradyear("2025");
		s1.setMobno("9600250499");
		
		s2.setSid("421121104005");
		s2.setSname("Arigaran");
		s2.setCourse("B.E");
		s2.setStream("ECE");
		s2.setGradyear("2025");
		s2.setMobno("9324564345");
		
		s3.setSid("421121104007");
		s3.setSname("Dhoni");
		s3.setCourse("B.Tech");
		s3.setStream("ECE");
		s3.setGradyear("2025");
		s3.setMobno("9353566499");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		

	}

}
