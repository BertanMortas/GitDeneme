package com.bilgeadam.week03.lesson5;

public class Bank 
{
	public String bankaismi;
	public BankHesap bankahesabı;
	public Bank(String bankaismi, BankHesap bankahesabı) {
		super();
		this.bankaismi = bankaismi;
		this.bankahesabı = bankahesabı;
	}
	@Override
	public String toString() {
		return "Bank [bankaismi=" + bankaismi + ", bankahesabı=" + bankahesabı + "]";
	}
	
	

}
