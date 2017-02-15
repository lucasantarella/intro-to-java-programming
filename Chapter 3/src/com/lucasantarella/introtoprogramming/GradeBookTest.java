package com.lucasantarella.introtoprogramming;

import java.util.Scanner;

public class GradeBookTest {

	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
		GradeBook gradeBook = new GradeBook();
		
		System.out.println("Please enter the name of the course:");
		
		gradeBook.setCourseName(scanner.nextLine());
		
		gradeBook.displayMessage();
	}
	
}
