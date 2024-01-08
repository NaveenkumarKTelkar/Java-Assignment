package com.Problemset;

import java.util.Scanner;

public class PrimeNumInterval {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting Number: ");
		int x = sc.nextInt();
		System.out.println("Enter the Destination Number: ");
		int y = sc.nextInt();
		
		int sum =0;
		if(x==0 && x==1 && y==0 && y==1|| x%2==0 && y%2==0) {
			System.out.println(x+ " "+y+ " are not a Prime Number");

		}else {
			for(int i=x; i<=y; i++) {
				sum= sum+i+2;
				System.out.println("Sum of Numbers in Given Interval is :"+sum);
			}
		}
	}

}
