package project1;
import java.util.*;

public class Demo {
	public static void main(String[] args) {
//		System.out.println("Hello World");
//		System.out.print("java programming start");
		int a,b,c;
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		c = a+b;
		System.out.println("Addition of a = "+a+"and b = "+b+" is :"+c);
		s.close();
	}
}
