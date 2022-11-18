package com.bilgeadam.week02.lesson1.polygon;

public class Kare implements IAlanKenar
{

	

	@Override
	public void kenar(int a)
	{
		
		
		System.out.println("birinci: "+a);
		
	}

	@Override
	public void alan(int lenght)
	{
		int c = lenght;
		
		
		int alan1 = c*c;
		
		System.out.println("alanınız: " + alan1);
		
	}
	
}
