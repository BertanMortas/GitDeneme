package com.bilgeadam.week03.lesson5;

public class BankHesap 
{
	
	public IHesapTurleri  ihesapturleri;
	public int hesapNo;
	public int bakiye;

	

	public BankHesap(IHesapTurleri Ihesapturleri, int hesapNo, int bakiye) {
		
		this.ihesapturleri= Ihesapturleri;
		this.hesapNo = hesapNo;
		this.bakiye = bakiye;
	}
	
	public int paracek()
	{
		int bakiye= this.bakiye;
		ihesapturleri.paracekmeislemi(bakiye);
		//System.out.println(bakiye);
	return bakiye;
	}

	public int parayatir()
	{
		int bakiye= this.bakiye;
		ihesapturleri.parayatirmaislemi(bakiye);
		
		//System.out.println(bakiye);
	return bakiye;
	
	}

	public int faizkazandir()
	{
		int bakiye = this.bakiye;
		ihesapturleri.faizkazan(bakiye);
		return bakiye;
	}
	public int faiziekleme()
	{
		int bakiye = this.bakiye;
		ihesapturleri.faizihesabaekleme(bakiye);
		return bakiye;
		
	}

	@Override
	public String toString() {
		return "BankHesap [hesapNo=" + hesapNo + ", bakiye=" + bakiye + "]";
	}

	
	
	
	
}
