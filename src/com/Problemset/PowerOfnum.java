package com.Problemset;

import java.util.Scanner;

public class PowerOfnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Base number");
		int base = sc.nextInt();
		System.out.println("Enter the Exponent number");
		int expo = sc.nextInt();
		
		int result =1;
		for(int i=0;i<expo;i++) {
			result = result * base;
		}
		System.out.println(base+ " power of "+expo+" is:"+result);
	}

}
