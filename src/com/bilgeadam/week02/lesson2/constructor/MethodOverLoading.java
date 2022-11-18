package com.bilgeadam.week02.lesson2.constructor;

public class MethodOverLoading 
{
	
	public static void display (int a)
	{
		System.out.println("i have a integer data:"+ a);
		
		
	}
	
	public static void display(String name)
	{
		
		System.out.println("i have a strin data:"+ name);
		
	}

	public static void main (String[] args) {
		display(3);
		display("bertan");
	}
}
