package com.bilgeadam.week02.lesson2.constructorHW;

import java.util.Scanner;

public abstract class Person
{
	
	public abstract void getname();
	{
		System.out.println("adınızı giriniz: ");
		Scanner scan = new Scanner(System.in);
		String ad;
		ad = scan.next();
		
	}
	
	public abstract void getid();
	{
		System.out.println("ID giriniz: ");
		Scanner scan = new Scanner(System.in);
		int id;
		id = scan.nextInt();
	}
	
	public abstract void getadres();
	{
	System.out.println("adresinizi giriniz: ");
	Scanner scan = new Scanner(System.in);
	String a;
	a = scan.next();
	System.out.println("adresiniz: "+ a);
	}

}
