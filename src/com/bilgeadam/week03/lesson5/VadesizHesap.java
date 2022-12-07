package com.bilgeadam.week03.lesson5;

import java.util.Scanner;

public class VadesizHesap implements IHesapTurleri
{
	Scanner scan = new Scanner(System.in);

	int cekilecektutar;
	int yatirilicaktutar;
	@Override
	public int paracekmeislemi(int BAKİYE) {
		System.out.println("lütfen çekilecek tutarı giriniz");
		cekilecektutar =scan.nextInt();
		BAKİYE = BAKİYE - cekilecektutar;
		System.out.println("çekimden sonra kalan bakiye: "+BAKİYE);
	return BAKİYE;
	}

	@Override
	public int parayatirmaislemi(int BAKİYE) {
		System.out.println("lütfen yatırılacak tutarı giriniz");
		yatirilicaktutar =scan.nextInt();
		BAKİYE = BAKİYE + yatirilicaktutar;
		System.out.println("eklemeden sonra güncel bakiyeniz: "+BAKİYE);
	return BAKİYE;
	}

	@Override
	public double faizkazan(int BAKİYE) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double faizihesabaekleme(int BAKİYE) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
