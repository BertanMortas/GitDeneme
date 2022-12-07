package com.bilgeadam.week03.lesson3;

import java.util.Scanner;

public class Atm {
	
	private static int hesap = 1500;
	private static String id1="user";
	private static String password1="1234";

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
	boolean durum = true;
	boolean giris = true;
		
		
		
		System.out.println("Lütfen id giriniz: ");
		String id = scan.next();
		System.out.println("Lütfen password giriniz: ");
		String password =scan.next();
		
		if (id.equals(id1) && password.equals(password1))
		{
			System.out.println("Doğru giriş yaptınız");
			
			int input=0;
	        while(durum) {
	        	
	        	displaymenu();
	        	
	        input = scan.nextInt();
	        switch (input) {
	        case 1:
	        	//Scanner scan = new Scanner(System.in);
	    		System.out.println("Lütfen yatırılacak parayı seçiniz ");
	    		int para1 =scan.nextInt();
	        	parayatırma(para1);
	            
	            break;
	        case 2:
	        	//Scanner scan = new Scanner(System.in);
	    		System.out.println("Lütfen çekilecek parayı seçiniz ");
	    		int para2 =scan.nextInt();
	        	paracekme(para2);
	            
	            break;
	        case 4:
	        	durum = false;
	        	break;
	            
	        case 3:
	        	bakiyesorgulama();
	        	
	        	break;
	        	
	        default:
	            System.out.println("Yanlis giris");
	            break;
	        }
	       }
			
		}
		else
		{
			System.out.println("Yanlış giriş yaptınız. Kalan hak 2...");
			System.out.println("Lütfen id giriniz: ");
			String id2 = scan.next();
			System.out.println("Lütfen password giriniz: ");
			String password2 =scan.next();
			if (id2.equals(id1) && password2.equals(password1))
			{
				System.out.println("Doğru giriş yaptınız");
				
				int input=0;
		        while(durum) {
		        	
		        	displaymenu();
		        	
		        input = scan.nextInt();
		        switch (input) {
		        case 1:
		        	//Scanner scan = new Scanner(System.in);
		    		System.out.println("Lütfen yatırılacak parayı seçiniz ");
		    		int para1 =scan.nextInt();
		        	parayatırma(para1);
		            
		            break;
		        case 2:
		        	//Scanner scan = new Scanner(System.in);
		    		System.out.println("Lütfen çekilecek parayı seçiniz ");
		    		int para2 =scan.nextInt();
		        	paracekme(para2);
		            
		            break;
		        case 4:
		        	durum = false;
		        	break;
		            
		        case 3:
		        	bakiyesorgulama();
		        	
		        	break;
		        	
		        default:
		            System.out.println("Yanlis giris");
		            break;
		        }
		       }
				
			}
			else
			{
				System.out.println("Yanlış giriş yaptınız. Kalan hak 2...");
				System.out.println("Lütfen id giriniz: ");
				String id3 = scan.next();
				System.out.println("Lütfen password giriniz: ");
				String password3 =scan.next();
				System.out.println("Yanlış giriş yaptınız. Kalan hak 1...");
				if (id3.equals(id1) && password3.equals(password1))
				{
					System.out.println("Doğru giriş yaptınız");
					
					int input=0;
			        while(durum) {
			        	
			        //	displaymenu();
			        	
			        input = scan.nextInt();
			        switch (input) {
			        case 1:
			        	//Scanner scan = new Scanner(System.in);
			    		System.out.println("Lütfen yatırılacak parayı seçiniz ");
			    		int para1 =scan.nextInt();
			        	parayatırma(para1);
			            
			            break;
			        case 2:
			        	//Scanner scan = new Scanner(System.in);
			    		System.out.println("Lütfen çekilecek parayı seçiniz ");
			    		int para2 =scan.nextInt();
			        	paracekme(para2);
			            
			            break;
			        case 4:
			        	durum = false;
			        	break;
			            
			        case 3:
			        	bakiyesorgulama();
			        	
			        	break;
			        	
			        default:
			            System.out.println("Yanlis giris");
			            break;
			        }
			       }
					
				}
				else
				{
					System.out.println("Yanlış giriş yaptınız. Kartınız bloke oldu");
					
				}
		}
		
	}

		
	//	kullanicigiris(giris);
		
		
		int input=0;
        while(durum) {
        	
        //	displaymenu();
        	
        input = scan.nextInt();
        switch (input) {
        case 1:
        	//Scanner scan = new Scanner(System.in);
    		System.out.println("Lütfen yatırılacak parayı seçiniz ");
    		int para1 =scan.nextInt();
        	parayatırma(para1);
            
            break;
        case 2:
        	//Scanner scan = new Scanner(System.in);
    		System.out.println("Lütfen çekilecek parayı seçiniz ");
    		int para2 =scan.nextInt();
        	paracekme(para2);
            
            break;
        case 4:
        	durum = false;
        	break;
            
        case 3:
        	bakiyesorgulama();
        	
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
		System.out.println("1: para yatırma ");
		System.out.println("2: para çekme ");
		System.out.println("3: Bakiye sorgulama ");
		System.out.println("4: çıkış ");
		
	}

	private static int bakiyesorgulama() 
	{
	System.out.println(hesap);
		return hesap;
	}

	private static int paracekme(int para)
	{if(hesap>para)
	{
		hesap=hesap-para;
	}
	else {
		System.out.println("bakiyeniz yetersiz");
	}
	return hesap;
	}

	private static int parayatırma(int para) 
	{
		hesap=hesap+para;
		return hesap;
	}

	private static String kullanicigiris(String durum) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen id giriniz: ");
		String id = scan.next();
		System.out.println("Lütfen password giriniz: ");
		int password =scan.nextInt();
		return durum;
		
		
	}

}

