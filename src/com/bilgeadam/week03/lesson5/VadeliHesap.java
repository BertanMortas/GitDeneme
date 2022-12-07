package com.bilgeadam.week03.lesson5;

import java.util.Scanner;

public class VadeliHesap implements IHesapTurleri {
	Scanner scan = new Scanner(System.in);

	double faizorani;
	@Override
	public int paracekmeislemi(int BAKİYE) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int parayatirmaislemi(int BAKİYE) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double faizkazan(int BAKİYE) {
		
	//	System.out.println("lütfen faiz oranı giriniz");
	//	faizorani =scan.nextDouble();
		double BAKİYE1 = Double.valueOf(BAKİYE);
		BAKİYE1  = BAKİYE1 *faizorani;
	//	System.out.println("faizden kazılan para: "+BAKİYE1);
		return BAKİYE;
		//return BAKİYE1 ;
	}
//implements IHesapTurleri{

	@Override
	public double faizihesabaekleme(int BAKİYE) {
		
	//System.out.println("lütfen faiz oranı giriniz");
	//faizorani =scan.nextDouble();
		double BAKİYE1 = Double.valueOf(BAKİYE);
		BAKİYE1  = BAKİYE1 *faizorani;
		BAKİYE = (int) (Double.valueOf(BAKİYE)+BAKİYE1);
		
	//	System.out.println("eklemeden sonra güncel bakiyeniz: "+BAKİYE);
		
		return BAKİYE;
	}

	

	
	
	
	
	
	
//	public int kazanılanfaiz(int faizoranı)
//	{
//		int kazanılanpara;
//		int bakiye1 = bakiye*faizoranı;
//		kazanılanpara=bakiye1 - bakiye;
//		System.out.println("faizden kazılan para"+kazanılanpara);
//		return kazanılanpara;
//	}
//	
//	public int bakiyevefaiz(int faizoranı)
//	{
//	bakiye = bakiye*faizoranı;
//	System.out.println("faiz ile güncel bakiyeniz"+bakiye);
//	return bakiye;
//	}

	

	

}
