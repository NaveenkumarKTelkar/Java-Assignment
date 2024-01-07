package com.Problemset;

import java.util.Scanner;

public class PrimeNumb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		
		if(n==0 && n==1|| n%2==0) {
			System.out.println(n+ " is not a Prime Number");
		}else {
			System.out.println(n+ " is a Prime Number");
		}
	}

}
