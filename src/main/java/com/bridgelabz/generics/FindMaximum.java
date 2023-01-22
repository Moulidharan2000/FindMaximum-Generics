package com.bridgelabz.generics;

import java.util.Scanner;

public class FindMaximum {

	public static <T> void Maximum(T num1, T num2, T num3) {
		T max = num1;
		if(((Float)num2).compareTo((Float)max)>0 && ((Float)num2).compareTo((Float)num3)>0)
			System.out.println(num2+" is Maximum");
		else if(((Float)num3).compareTo((Float)num2)>0)
			System.out.println(num3+" is Maximum");
		else
			System.out.println(num1+" is Maximum");
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the First Number : ");
		Float num1 = scan.nextFloat();
		
		System.out.print("Enter the Second Number : ");
		Float num2 = scan.nextFloat();
		
		System.out.print("Enter the Third Number : ");
		Float num3 = scan.nextFloat();
		
		Maximum(num1, num2, num3);
	}
}
