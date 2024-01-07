package com.Problemset;

import java.util.Scanner;

public class SumNaturalNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int Num = sc.nextInt();
		
		int sum =0;
		for(int i=sum; i<=Num; i++) {
			sum = sum +i;
		}
		
		System.out.println("The sum of the first " + Num + " natural numbers is: " + sum);
	}

}
