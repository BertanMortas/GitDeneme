package com.bilgeadam.week02.lesson1.IfElse;

import java.util.Scanner;

public class BodyMassHW {

	public static void main(String[] args)
	{
		/*
		 * kullanıcıdan kilosunu isteyin
		 * boyunu isteyin
		 * cinsiyet isteyin
		 *-bu sıra ile istemelisin çünkü sayıdan sonra int alamıyorsun
		 * bmi = (ağarlık * 10000)/ boy ^ 2
		 * bmi hesapla
		 * kadınalr için bmi 19dan küçükse zayıfsın
		 * if (bmi<19)
		 * if(cinsiyet.equals("erkek")) bu stringler için böyle yapılıyor
		 * bolean ilede olabilir true yada false olarakta yapılabilir
		 * 19-24 normal
		 * 24-30 kilolu
		 * 30 üstü obez
		 * arkekler için
		 *  20den küçükse zayıf
		 * 20-25 normal
		 * 25-30 kilolu
		 * 30 üstü obez
		 * 
		 */
		double bmi;
		int kilo;
		int boy;
		
		String cinsiyet2 = null;
		

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen kilonuzu giriniz: ");
		kilo = scan.nextInt();
		
		System.out.println("Lütfen boyunuzu giriniz (cm)");
		boy = scan.nextInt();
		
		System.out.println("Lütfen cinsiyetinizi erkek için 'e' kadnın için 'k' olarak giriniz ");
		cinsiyet2 = scan.next();
		
		bmi = (kilo*10000)/Math.pow(boy, 2);
		
		if(cinsiyet2.equals("e"))
		{
			if (bmi<20)
			{
				System.out.println("bmi sonucunuz: " + bmi + " zayıf");
			}
			else if (bmi>= 20 && bmi<25) 
			{
				System.out.println("bmi sonucunuz: " +bmi+ " normal");
			}
			else if (bmi>= 25 && bmi<30) 
			{
				System.out.println("bmi sonucunuz: " +bmi+ " kilolu");
			}
			else if (bmi>= 30) 
			{
				System.out.println("bmi sonucunuz: " +bmi+ " obez");
			}
		}
		
		else if (cinsiyet2.equals("k"))
		{
			
			if (bmi<19)
			{
				System.out.println("bmi sonucunuz: " +bmi+ " zayıf");
			}
			else if (bmi>= 19 && bmi<24) 
			{
				System.out.println("bmi sonucunuz: " +bmi+ " normal");
			}
			else if (bmi>= 24 && bmi<30) 
			{
				System.out.println("bmi sonucunuz: " +bmi+ " kilolu");
			}
			else if (bmi>= 30) 
			{
				System.out.println("bmi sonucunuz: " +bmi+ " obez");
			}
			
			
		}
		else
		{
			System.out.println("yanlış değer girdiniz");
		}
		
	}

}
