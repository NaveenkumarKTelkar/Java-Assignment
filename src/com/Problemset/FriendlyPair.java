package com.Problemset;

import java.util.Scanner;

public class FriendlyPair {
	public static int friendlyPair(int num) {
		int sum=0;
		for(int i=1;i<num;i++) {
			if (num % i == 0)
				sum=sum+i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n1=sc.nextInt();
		System.out.println("Enter the number");
		int n2=sc.nextInt();
		
		int sum1=friendlyPair(n1);
		int sum2=friendlyPair(n2);
		
		 if(sum1 / n1 == sum2 / n2){
		       System.out.println (n1+" and "+n2+" are friendly pairs");
		 }else {
		       System.out.println (n1+" and "+n2+" are not friendly pairs");
	}
	}
}
