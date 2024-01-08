package com.Problemset;

import java.util.Scanner;

public class ArmstrongRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting number");
		int start = sc.nextInt();
		System.out.println("Enter the Ending number");
		int end = sc.nextInt();
		
		for(int i=start; i<=end;i++) {
			int temp =i;
			int x,a= 0;
			while(temp!=0) {
				x=temp%10;
				a=a+(x*x*x);
				temp/=10;
			} 
			if(a==i) {
				System.out.println(i);
			}
		}
	}

}
