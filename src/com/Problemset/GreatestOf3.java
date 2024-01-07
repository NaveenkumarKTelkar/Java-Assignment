package com.Problemset;

import java.util.Scanner;

public class GreatestOf3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value a : ");
		int a =sc.nextInt();
		System.out.println("Enter the value b : ");
		int b = sc.nextInt();
		System.out.println("Enter the value c : ");
		int c = sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println(+a+ " is Greatest Number");
		}else if (b>c && b>a){
			System.out.println(+b+ " is Greatest number");
		}else{
			System.out.println(+c+ " is Greatest number");
		}
	}

}
