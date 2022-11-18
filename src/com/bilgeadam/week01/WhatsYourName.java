package com.bilgeadam.week01;

import java.util.Scanner;

public class WhatsYourName {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		String isim;
		
		System.out.println("lütfen isim giriniz: ");
		
		isim = scan.nextLine();
		
		System.out.println("merhaba " +isim);

	}

}
