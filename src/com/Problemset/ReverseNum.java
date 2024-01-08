package com.Problemset;

import java.util.Scanner;

public class ReverseNum {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int rem=0;
		int reverse=0;
		while(num>0) {
				rem = num%10; // to read the last digit
				reverse = reverse*10+rem; //to store value
				num = num/10; // and remove the last digit
			}
		System.out.println(reverse);
	}
}
