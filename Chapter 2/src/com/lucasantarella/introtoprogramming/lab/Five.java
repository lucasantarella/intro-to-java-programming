package com.lucasantarella.introtoprogramming.lab;

import java.util.Scanner;

public class Five {
	private static String input;
	private static String[] inputChars;
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter five digit integer:");
		input = scanner.nextLine();
		
		inputChars = input.split("");
		
		System.out.printf("Digits in %s are", input);
		
		for (String string : inputChars) {
			System.out.print(" " + string);
		}

		System.out.print("\n");
	}

}
