package com.Problemset;

import java.util.Scanner;

public class SumOfDigits {
	public static int sumDigit(int num) {		
		int sum =0;
		while(num>0) {
			int rem = num%10;
			num = num/10;
			sum= sum+rem;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int sum = SumOfDigits.sumDigit(num);
		System.out.println(sum);
	}

}
