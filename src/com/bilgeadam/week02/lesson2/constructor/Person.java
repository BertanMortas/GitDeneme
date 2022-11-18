package com.bilgeadam.week02.lesson2.constructor;

public class Person 
{
	
	public String name;
	public int age;
	public String occupation;
	public double salary;
	
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		
	}

	
	 public Person()
	{
		System.out.println("bir person yarattınız");	
		
	}


	public Person(String name, int age, String occupation, double salary)
	{
		System.out.println("bir person yarattınız");	
		this.name = name;
		this.age = age;
		this.occupation = occupation;
		this.salary = salary;
	}


	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", occupation=" + occupation + ", salary=" + salary + "]";
	}
	
	
}
	
	

