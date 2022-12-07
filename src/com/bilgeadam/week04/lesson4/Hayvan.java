package com.bilgeadam.week04.lesson4;

public abstract class Hayvan
{

	public String ad;
	public int kilo;
	public int uzunluk;
	public boolean tehlikelimi;
	
	
	public Hayvan(String ad, int kilo, int uzunluk) {
		super();
		this.ad = ad;
		this.kilo = kilo;
		this.uzunluk = uzunluk;
		
	}


	public abstract String sesCıkar();


	@Override
	public String toString() {
		return "Hayvan [ad=" + ad + ", kilo=" + kilo + ", uzunluk=" + uzunluk + ", tehlikelimi=" + tehlikelimi + "]";
	}


	


	
	
}
