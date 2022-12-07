package com.bilgeadam.week04.lesson4;

public class Yilan extends Surungen {

	public Yilan(String ad, int kilo, int uzunluk) {
		super(ad, kilo, uzunluk);
		// TODO Auto-generated constructor stub
		this.tehlikelimi=true;
	}

	@Override
	public void surun() {
		System.out.println("sürünüyor");
		
	}

	@Override
	public String sesCıkar() {
		// TODO Auto-generated method stub
		return " tıslıyor.. ";
	}

}
