package com.bilgeadam.week03.lesson2;

import java.util.Scanner;
import com.bilgeadam.week03.lesson1.*;

public class HesapMakinasi {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen hesap için sayıları giriniz");
		int a,b ;
		a = scan.nextInt();
		b = scan.nextInt();
		

		
		
		boolean conditions = true;
		int input=0;
        while(conditions) {
        	
        	displaymenu();
        	
        input = scan.nextInt();
        switch (input) {
        case 1:
        	sum(a,b);
            
            break;
        case 2:
        	diff(a,b);
            
            break;
        case 6:
        	conditions = false;
        	break;
            
        case 3:
        	multiply(a,b);
        	
        	break;
        case 4:
        	divide(a,b);
            	
            	break;
        case 5:
        	mod(a,b);
            	
            	break;
        	
        default:
            System.out.println("Yanlis giris");
            break;
            
        	}
        }
	

	}

	private static void displaymenu()
	{
		System.out.println("lütfen seçim yapınız: ");
		System.out.println("1: toplama ");
		System.out.println("2: çıkarma ");
		System.out.println("3: çarpma ");
		System.out.println("4: bölme ");
		System.out.println("5: kalan bulma ");
		System.out.println("6: çıkış ");
	}

	private static int sum(int a, int b) 
	{	
		int c = a+b;
		System.out.println("Sonuç: "+c);
		return (a+b);
	}

	private static int diff(int a, int b) 
	{	int c = a-b;
	System.out.println("Sonuç: "+c);
		return (a-b);
	}

	private static int multiply(int a, int b) 
	{int c = a*b;
	System.out.println("Sonuç: "+c);
		return (a*b);
	}

	private static int divide(int a, int b) 
	{int c = a/b;
	System.out.println("Sonuç: "+c);
		return (a/b);
	}

	private static int mod(int a, int b) 
	{
		double c = a%b;
	System.out.println("Sonuç: "+c);
		return (a%b);
	}

	
	

}
