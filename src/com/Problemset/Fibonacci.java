package com.Problemset;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();

		int k=0,a=1,b=1;
		System.out.print("1 1 ");
		while(k<=n) {
			k=a+b;
			if(k>=n)
				break;
			a=b;
			b=k;
			System.out.print(k+" ");
		}
	}

}
