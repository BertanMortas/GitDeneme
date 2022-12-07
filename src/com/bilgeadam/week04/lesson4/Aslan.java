package com.bilgeadam.week04.lesson4;

public class Aslan extends MemeliHayvan{
	
	

	public Aslan(String ad, int kilo, int uzunluk) {
		super(ad, kilo, uzunluk);
		this.tehlikelimi=true;
	}

	@Override
	public void yuru() {
	//	System.out.println("yürüyor");
		
	}

	@Override
	public String sesCıkar() {
		// TODO Auto-generated method stub
		return " kükrüyor...";
	}

	

}
