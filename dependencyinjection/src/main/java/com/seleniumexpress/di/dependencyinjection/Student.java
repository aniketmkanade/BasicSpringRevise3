package com.seleniumexpress.di.dependencyinjection;

public class Student 
{
	private String studentname;
	
	
	public Student(String studentname) 
	{
		this.studentname = studentname;
	}

	public void displayStudentInfo()
	{
		System.out.println("Student name is: " + studentname);
	}
}
