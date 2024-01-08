package com.Problemset;

import java.util.Scanner;
// 1,1,2,3,5,8,13,21,34,55,89,144,233,377....n

public class nthTermFibo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N to find the Nth term of Fibonacci series: ");
        int n = sc.nextInt();

        int a=0;
        int b=1;
        int c;
        for(int i=0;i<n;i++) {
        	c=a+b;
        	a=b;
        	b=c;
        }
        System.out.println(a);
	}
	
}
