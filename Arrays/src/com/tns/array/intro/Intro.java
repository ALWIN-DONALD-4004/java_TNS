package com.tns.array.intro;
import java.util.*;
public class Intro {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		
		score[0] = sc.nextInt();
		score[1] = sc.nextInt();
		score[2] = sc.nextInt();
		score[3] = sc.nextInt();
		score[4] = sc.nextInt();
		
		int sum = score[0] + score[1]+ score[2]+ score[3]+ score[4];
		System.out.println(sum);
	}

}
