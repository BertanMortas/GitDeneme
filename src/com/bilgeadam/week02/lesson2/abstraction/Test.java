package com.bilgeadam.week02.lesson2.abstraction;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{
		//animal class ı makesoubd
		// dog hav hav / cat miav miav
		
		Scanner scan = new Scanner(System.in);
		int age;
		System.out.println("yaşınızı giriniz");
		age = scan.nextInt();
		if (age<18) {
			
			Child ch = new Child();
			ch.getname();
			ch.getage();
			ch.gethealty();	
			ch.kizamikasisi();
		}
		else if (age>=18)
		{
			Adult ad = new Adult();
			ad.getname();
			ad.getage();
			ad.gethealty();
					
		}
		else {
			System.out.println("yanlış giriş yaptınız...");
		}
		
		
		
		

	}

}
