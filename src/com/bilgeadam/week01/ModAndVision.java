package com.bilgeadam.week01;

import java.util.Scanner;

public class ModAndVision {

	public static void main(String[] args) 
	{
		
		
		Scanner scan = new Scanner(System.in);
		
		double x;
		double y;
		System.out.println("please enter two int");
		
		x = scan.nextDouble();
		y= scan.nextDouble();
		
		double bölüm;
		
		bölüm = x/y;
		
		System.out.println("bölüm: " + bölüm);
		
		double mod;
		mod = x%y;
		System.out.println(mod);
		
		
				

	}

}
