package com.bilgeadam.week02.lesson2.constructorHWcozum;

public class Teacher extends Person
{
	

	public String branch;

	public Teacher(long id, String name, String branch) {
		super(id, name);
		this.branch = branch;
	}
	
	
}
