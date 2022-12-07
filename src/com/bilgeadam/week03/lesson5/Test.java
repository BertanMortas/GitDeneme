package com.bilgeadam.week03.lesson5;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) 
	{
		VadesizHesap vdsz = new VadesizHesap();
		VadeliHesap vdli = new VadeliHesap();
		VadeliHesap vdli1 = new VadeliHesap();
		BankHesap bankhesap1 = new BankHesap(vdli, 122234, 1000);
		BankHesap bankhesap = new BankHesap(vdsz, 1234, 1000);
		Bank bank = new Bank("garanti", bankhesap);
		Bank bank1 = new Bank("garanti", bankhesap1);
		

		List<Bank> bankalist = new ArrayList<>();
		
		bankalist.add(bank1);
		
		System.out.println(bankalist);
		
		//bank.bankahesabı.ihesapturleri.hesapislemleri(bankhesap.bakiye);
		//bank.bankahesabı.paracek();
		//bank.bankahesabı.ihesapturleri.paracekmeislemi(bankhesap.bakiye);
	//	bank.bankahesabı.parayatir();
		
	//	bank1.bankahesabı.faizkazandir();
		
		
		
	//	BankHesap bankhesap1 = new BankHesap(vdli, 1234, 1000);
		
		/*
		VadesizHesap vdsz = new VadesizHesap("", 1234, 1000);
		VadeliHesap vdli = new VadeliHesap("vadeli",1234,1500);
		
		
		BankHesap bankhesap = new BankHesap(vdli, 1234, 1000);
		Bank bank = new Bank("Garanti",bankhesap);
		
		vdsz.paracek(100);
		
		
		System.out.println(vdsz.bakiye);
		vdli.kazanılanfaiz(2);
		vdli.bakiyevefaiz(3);
		
		*/
	}

}
