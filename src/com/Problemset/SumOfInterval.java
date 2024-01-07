package com.Problemset;

import java.util.Scanner;

public class SumOfInterval {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting Number: ");
		int x = sc.nextInt();
		System.out.println("Enter the Destination Number: ");
		int y = sc.nextInt();
		
		int sum =0;
		for(int i=x; i<=y; i++) {
			sum= sum+i;
		}
		System.out.println("Sum of Numbers in Given Interval is :"+sum);
	}

}
