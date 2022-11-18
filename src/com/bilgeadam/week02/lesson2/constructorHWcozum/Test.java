package com.bilgeadam.week02.lesson2.constructorHWcozum;

public class Test {

	public static void main(String[] args)
	{
		Course math = new Course("Math101", "Fundamentals of Algebra");
		Course java = new Course("javaSE", "Fundamentals of java");
		Address adres1 = new Address("ankara","2494.sokak");
		
		Student student1 = new Student(1234,"bertan",java);
		
		student1.address=adres1;
		System.out.println(student1);
		
		student1.toString();

	}

}
