package com.Problemset;

import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int s=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) { 
				  s=s+i;
			}
		}
		if(s==num) {
				System.out.println(num+" is a perfect number");
			}else {
				System.out.println(num+" is not a perfect number");
			}
	}

}
