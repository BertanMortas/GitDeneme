package com.bilgeadam.week03.lesson2;

import java.util.Scanner;

public class BasicMethods4 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("sayi giriniz");
		int a = scan.nextInt();
		System.out.println("sayi giriniz");
		int b = scan.nextInt();
		
		sum(a,b);
		
	System.out.println(sum(a,b));

	}
	/*

	private static int sum(int a, int b) 
	{
		if(a>b)
		{
			System.out.println("ilk sayı büyük "+b);
			return b;
		}
		else 
		{
			int toplam = 0;
			for (int i = 0; i < (b-a); i++) 
			{
				toplam = toplam + (a+i);
				
			}
			System.out.println(toplam);
			return toplam;
		}
		
	}
	*/
	
	private static int sum(int start, int end) 
	{
		if(end>start)
		{
			int toplam = end + sum(start,end-1); // sum metodunu yine 
												//çaırdık ama end -1 olarak geldi
											//15 + sum(10,14)
										//	15 + 14 + sum(10,13) ...
			return toplam;
		}
		else {
			return end;
		}
	}

}
