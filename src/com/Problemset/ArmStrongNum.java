package com.Problemset;

import java.util.Scanner;

public class ArmStrongNum {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int temp=num;
		int x,a= 0;
		while(num!=0) {
			x=num%10;
			a=a+(x*x*x);
			num/=10;
		}
		if(temp==a) {
			System.out.println(temp+" is a armstrong number");
		}else {
			System.out.println(temp+" is not a armstrong number");
		}	
	}

}
