package com.Problemset;

import java.util.Scanner;

public class pnNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		if (num >= 0) {
            System.out.println("The number is positive.");
        }else {
            System.out.println("The number is negative.");
        }
	}

}
