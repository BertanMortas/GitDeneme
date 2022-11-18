package com.bilgeadam.week01;

import java.util.Scanner;

public class FiyatBulma {

	public static void main(String[] args) 
	{
		int y;
		int z;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen bulmak istediğiniz Satış Fiyatını giriniz: ");
		
		int x = scan.nextInt();
		
		y = (x * 100) / (100+18);
		
		System.out.println("KDV'siz fiyatınız: "+ y);
		
		z = (y*100) / (100+15);
		
		System.out.println("Ham fiyatınız: "+ z);

	}

}
