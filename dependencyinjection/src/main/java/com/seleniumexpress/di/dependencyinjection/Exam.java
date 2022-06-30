package com.seleniumexpress.di.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student ani = context.getBean("student", Student.class);
		ani.displayStudentInfo();
	}
}
