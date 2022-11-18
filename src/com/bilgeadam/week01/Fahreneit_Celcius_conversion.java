package com.bilgeadam.week01;

import java.util.Scanner;

public class Fahreneit_Celcius_conversion {

	public static void main(String[] args) 
	{
		
		// fahrenayt ı celciusa çevir çıktı celcius
		
		double f ;
		double c ;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lütfen çevirmek istediğiniz fahrenayt değerini giriniz");
		
		f = scan.nextDouble();
		
		c = (f-32) / 1.8;
		
		System.out.printf("%.2f",c);
		
		//C = (F – 32) / 1.8
		
	}

}
