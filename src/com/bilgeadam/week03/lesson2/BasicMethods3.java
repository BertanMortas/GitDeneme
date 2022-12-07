package com.bilgeadam.week03.lesson2;

import java.util.Scanner;

public class BasicMethods3 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Rank giriniz");
		double a1 = scan.nextDouble();
		System.out.println("sayi giriniz");
		int a2 = scan.nextInt();
		
		rankgrade(a1);
		
		even(a2);
		
	}

	private static boolean even(int a) 
	{
		boolean b = true;
		if(a%2==0)
		{
			System.out.println(b);
		}
		else
		{
			b=false;
			System.out.println(b);
		}
		return b;
	}

	private static double rankgrade(double a)
	{
	
		if(a>=200.5)
		{
			System.out.println("your grade is RANK A");
			
		}
		else if (a>=122.4)
		{
			System.out.println("your grade is RANK B");
			
		}
		else if (a<122.4)
		{
			System.out.println("your grade is RANK C");
			
		}
		return a;
		
	}
	

}
