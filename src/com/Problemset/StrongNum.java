package com.Problemset;

import java.util.Scanner;

public class StrongNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : " );
		int n = sc.nextInt();
		
		int i,fact,lastdig;
		
		int total = 0;
		int temp = n;
		
		while(n != 0){
			i = 1;
			fact = 1;
			lastdig = n % 10;
		
			while(i <= lastdig){
				fact = fact * i;
				i++;
			}
		total = total + fact;
		n = n / 10;
	  }
		
		if(total == temp) {
		System.out.println(temp + " is a strong number");
		}else
		System.out.println(temp + " is not a strong number");
		}
}
