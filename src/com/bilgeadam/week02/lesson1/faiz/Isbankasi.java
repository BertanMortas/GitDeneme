package com.bilgeadam.week02.lesson1.faiz;

public class Isbankasi implements IFaiz
{

	@Override
	public void faizoranı(double anapara, int gün)
	{
		
		double f = 1.98;
		double a = anapara;
		int g = gün;
		
		double kazanc = (a/100) * (f/365) * g ;
		System.out.println("İŞ bankası kazancınız: " + kazanc);
	}

}
