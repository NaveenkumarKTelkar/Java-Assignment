package com.Problemset;

import java.util.Scanner;

public class EvenOddNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println(+num+ " is Even number");
		}
		System.out.println(+num+ " is Odd number");
	}

}
