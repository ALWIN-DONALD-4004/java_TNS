package com.tns.AssignmentOne;
import java.util.*;
public class Student {
	   private String sname;
	   private String rollno;
	   private String grade;
	   private float percent;
	   
	   Scanner sc = new Scanner(System.in);
	   
	   public void setSname() {
		   System.out.print("Enter your Name : ");
		   this.sname = sc.nextLine();
	   }
	   
	   public String getSname() {
		   return sname;
	   }

	   public String getRollno() {
		   return rollno;
	   }

	   public void setRollno() {
		   System.out.print("Enter your Roll no : ");
		   this.rollno = sc.nextLine();
	    }

	    public String getGrade() {
		    return grade;
	    }

	    public void setGrade() {
	    	System.out.print("Enter your Grade : ");
		    this.grade = sc.nextLine();
	     }

	    public float getPercent() {
		     return percent;
	     } 

	    public void setPercent() {
	    	System.out.print("Enter your Percentage : ");
		     this.percent = sc.nextFloat();
	     }

		@Override
		public String toString() {
			return "Name        : " + sname + "\nRoll no     : " + rollno + "\nGrade       : " + grade + "\nPercentage  : " + percent +" %";
		}
}
