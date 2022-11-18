package com.bilgeadam.week01;

public class Test {

	public static void main(String[] args)
	{
		
		Computer a = new Computer();
		
		a.brand = "Apple";
		a.ramsize= 32;
		a.screensize = 16.3;
		
		
		a.showproperties(a.brand, a.ramsize, a.screensize);
		
		a.konsolabagla(a.brand);
		
		Laptop b = new Laptop();
		
		b.bataryCapacity = 95;
		
		b.remainingBatteryCapacity(100, b.bataryCapacity);
		
		
		
		
	}

}
