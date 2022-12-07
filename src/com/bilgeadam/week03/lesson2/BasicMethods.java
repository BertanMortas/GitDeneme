package com.bilgeadam.week03.lesson2;

import java.util.Scanner;

public class BasicMethods {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("sayi bir ve ikiyi giriniz");
		int sayi1= scan.nextInt();
		int sayi2 = scan.nextInt();
		
		
		int a = buyukKucuk(sayi1, sayi2);
		System.out.println("küçük sayi: "+a);
		
		System.out.println("küçük sayi: "+buyukKucuk(sayi1, sayi2));

	}
	
	public static int buyukKucuk(int sayi1, int sayi2)
	{
	
		 int sayimin;
		
		if (sayi1<sayi2)
		{
			sayimin =sayi1;
			//System.out.println("küçük sayi: "+sayi1);
			
		}
		else 
			//(sayi2<sayi1)
		{
			sayimin =sayi2;
			//System.out.println("küçük sayi: "+sayi2);
			
		}
		
		return sayimin;
		
	}

}
