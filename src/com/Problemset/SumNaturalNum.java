package com.Problemset;

import java.util.Scanner;

public class SumNaturalNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N");
		int N = sc.nextInt();
		
		int sum = (N * (N+1))/2;
		
		System.out.println("The sum of the first " + N + " natural numbers is: " + sum);
	}

}
