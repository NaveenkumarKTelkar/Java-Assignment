package com.Problemset;

import java.util.Scanner;

public class PalindromeNum {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int rem=0;
		int reverse=0;
		int palindrome=num;
		while(num>0) {
				rem = num%10; // to read the last digit
				reverse = reverse*10+rem; //to store value
				num = num/10; // and remove the last digit
			}
		System.out.println(reverse);
		
		if(palindrome==reverse) {
			System.out.println(palindrome+" is a palindrome number");
		}else {
			System.out.println(palindrome+" is not a palindrome number");
		}
	}
}
