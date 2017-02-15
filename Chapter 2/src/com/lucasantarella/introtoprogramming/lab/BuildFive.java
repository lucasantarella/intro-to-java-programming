package com.lucasantarella.introtoprogramming.lab;

import java.util.Scanner;

public class BuildFive {
	private static String input1;
	private static String input2;
	private static String input3;
	private static String input4;
	private static String input5;
	private static int output;
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter first digit:");
		input1 = scanner.nextLine();

		System.out.println("Enter second digit:");
		input2 = scanner.nextLine();
		
		System.out.println("Enter third digit:");
		input3 = scanner.nextLine();

		System.out.println("Enter fourth digit:");
		input4 = scanner.nextLine();

		System.out.println("Enter fifth digit:");
		input5 = scanner.nextLine();
		
		output = Integer.parseInt(input1 + input2 + input3 + input4 + input5);
		System.out.printf("\nInteger composed from %s %s %s %s %s is %d", input1, input2, input3, input4, input5, output);
				
	}
}
