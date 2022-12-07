package com.bilgeadam.week04.lesson2;

public class Person {
	String name;
	String lastname;
	String gender;
	int age;
	public Person(String name, String lastname, String gender, int age) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.gender = gender;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", lastname=" + lastname + ", gender=" + gender + ", age=" + age + "]";
	}
	
	public void Speak()
	{
		System.out.println("hi i am "+this.name);
	}

}
