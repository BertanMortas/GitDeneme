package com.bilgeadam.week02.lesson2.abstraction;

import java.util.Scanner;

public class Adult extends Person
{
	
	

	@Override
	public void getname() {
		System.out.println("adınızı giriniz: ");
		Scanner scan = new Scanner(System.in);
		String a;
		a = scan.next();
		System.out.println("adınız: "+ a);
		
	}

	@Override
	public void gethealty() {
		boolean saglikli = false;
		Scanner scan = new Scanner(System.in);
		String a;
		System.out.println("sağlık durumunuzu 'saglikli' yada değil diye giriniz");
		a = scan.nextLine();
		if(a.equals("saglikli")) 
		{
			saglikli=true;
		}
		else if (a.equals("degil"))
		{
			saglikli=false;
		}
		if (saglikli == true)
		{
			System.out.println("chekup yapılsın");
		}
		else {
			System.out.println("muayne edilip ilaç yazılsın");
		}
			
		
	}

	@Override
	public void getage() {
		
		Scanner scan = new Scanner(System.in);
		int age;
		System.out.println("yaşınızı giriniz");
		age = scan.nextInt();
		System.out.println("yaşınız: "+age);
		
		
	}
	

}

