package com.bhagyavanth.assignment;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		
	Scanner scn = new Scanner(System.in);
	System.out.println("enter the number");
	int n = scn.nextInt();
	for (int i=0;i<=n;i++) {
		if(i%2==0) {
			System.out.println(i);
		}
	}
			
}
}