package com.lucasantarella.introtoprogramming.lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Calculations {
	private static int integer1;
	private static int integer2;
	private static int integer3;
	private static final Scanner scanner = new Scanner(System.in);
	private static List<Integer> inputs;
	
	public static void main(String[] args){
		System.out.println("Enter first integer:");
		integer1 = scanner.nextInt();
		
		System.out.println("Enter second integer:");
		integer2 = scanner.nextInt();
		
		System.out.println("Enter third integer:");
		integer3 = scanner.nextInt();
		
		System.out.printf("\nFor the numbers %d, %d, and %d\n", integer1, integer2, integer3);
		
		inputs = Arrays.asList(integer1, integer2, integer3);
		
		int largest = (int) Collections.max(inputs);
		int smallest = (int) Collections.min(inputs);
		int sum = integer1 + integer2 + integer3;
		int product = integer1 * integer2 * integer3;
		int average = (integer1 + integer2 + integer3) / 3;
		
		System.out.printf("Largest is %d\n", largest);
		System.out.printf("Smallest is %d\n", smallest);
		System.out.printf("Sum is %d\n", sum);
		System.out.printf("Product is %d\n", product);
		System.out.printf("Average is %d\n", average);
	}
}
