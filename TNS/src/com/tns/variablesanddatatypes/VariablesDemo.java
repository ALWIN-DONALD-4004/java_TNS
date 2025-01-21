package com.tns.variablesanddatatypes;

public class VariablesDemo {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//varible is a container which can hold data ,to represent data we need variables
		
		
		int a; //declaration
		a=100; //assignment
		
		
		
		//create variable
		
		int x = 100; //declaration + assignment
		System.out.println(x);
		                             //we can change variables that are not constant
		x=200;
		System.out.println(x);
		
		//here   x-------> Data type  , x =100 ---------> variable , x----------> variable name
		
		float itemprice = 10.25f;
		
		String name = "Alwin";
		
		char grad = 'A';
		
		
		//Approach 1	 ---> if the all the variables are belongs to different data type. applicable
		 int e = 100;
		 int f = 2000;
		 int g = 300;
		 
		 //Approach 2    ---> if the all the variables are belongs to same data type. applicable
		 int q,w,r;
		 q=100;
		 w=200;
		 r = 300;
		  
		 //Approach 3       ---> if the all the variables are belongs to same data type. applicable
		 int t=100,i=200,j=300;
		 
		 System.out.println("the value of i :" + t);  //--------> "+" is concatenation
		 System.out.println(t+" "+i+" "+j);
	}
}
