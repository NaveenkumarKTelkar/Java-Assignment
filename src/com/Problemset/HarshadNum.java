package com.Problemset;

import java.util.Scanner;

public class HarshadNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int sum=0;
		for(int i=1;i<=num;i++) { 
			sum += i;
		}
		if(sum%num==0) {
			System.out.println(num+" is a harshad number");
		}else {
			System.out.println(num+" is not a harshad number");
		}
	}

}
