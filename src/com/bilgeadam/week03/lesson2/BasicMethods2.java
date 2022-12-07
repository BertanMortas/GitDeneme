package com.bilgeadam.week03.lesson2;

import java.util.Scanner;

public class BasicMethods2 {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("ad giriniz");
		String ad = scan.next();
		System.out.println("soyad giriniz");
		String soyad = scan.next();
		System.out.println("kelime 1 giriniz");
		String a= scan.next();
		System.out.println("kelime 2 giriniz");
		String b= scan.next();
		
		adsoyad(ad,soyad);
		System.out.println(uzunkelime(a, b));
		uzunkelime(a, b);

	}

	private static String adsoyad(String ad, String soyad) 
	{
		System.out.println("hello "+ad);
		return ad;	
	}
	
	private static String uzunkelime(String a, String b) 
	{
		if (a.length()<b.length())
		{
			return b;
		}
		
		else if(a.length()==b.length())
		{
			
			System.out.println("kelimeler eşik uzunlukta");
			
			return null;
		}
		
		else
		{
			return a;
		}

		
		
		
		
	}

}
