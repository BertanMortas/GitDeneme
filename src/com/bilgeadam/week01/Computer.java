package com.bilgeadam.week01;

public class Computer
{

	public String brand;
	public int ramsize;
	public double screensize;
	
	public void showproperties(String marka, int ram, double screen)
	{
		System.out.println(marka +" has "+ram+" gb ramsize and " +screen+" inc screen");
	}
	
	public void konsolabagla(String marka)
	{
		System.out.println(marka+ " have connect to internet...");
		
	}
	
	
	
}
