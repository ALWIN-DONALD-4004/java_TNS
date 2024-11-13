package com.tns.testcaseproblems.one;
import java.util.*;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Enter the number : ");
	     int n = sc.nextInt();
	     
	     for (int i=1; i<=n ; i++) {
	    	 if(i==1) {
	    		 for(int j = 1;j<=n ; j++) {
	    			 System.out.print(j + " ");
	    		 }
	    	 }
	    	 else if (i==n) {
	    		 for(int j = n;j>= 1  ; j--) {
	    			 System.out.print(j + " ");
	    		 }
	    	 }
	    	 else {
	    		 System.out.print(i + " ");
	    		 for(int j =1 ; j<=n-2 ; j++) {
	    			 System.out.print("  ");
	    	 }
	    		 System.out.print(n+1-i);
	    		 	 
	     }
	    	 System.out.println();
	     }
	     
	     sc.close();

	}

}
