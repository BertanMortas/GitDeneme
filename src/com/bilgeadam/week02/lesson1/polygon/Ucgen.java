package com.bilgeadam.week02.lesson1.polygon;

public class Ucgen implements IAlanKenar

{

	@Override
	public void kenar(int a)
	{
		
		System.out.println("üçgenin kenarları: " + a);
		
	}

	@Override
	public void alan(int length) 
	{
		double c = length;
		double alan1= Math.pow(c, 2)*Math.sqrt(3)/4;
		System.out.println("alanınız: " + alan1);
		
	}
	
	
}
