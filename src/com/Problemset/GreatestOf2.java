package com.Problemset;

import java.util.Scanner;

public class GreatestOf2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value a : ");
		int a =sc.nextInt();
		System.out.println("Enter the value b : ");
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.println(+a+ " is Greatest Number");
		}else {
			System.out.println(+b+ " is Greatest number");
		}
	}

}
