package com.lucasantarella.introtoprogramming;

public class GradeBook {
	
	private String courseName;
	
	public void displayMessage(){
		System.out.printf("Welsome to the Gradebook for \n%s!", courseName);
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
}
