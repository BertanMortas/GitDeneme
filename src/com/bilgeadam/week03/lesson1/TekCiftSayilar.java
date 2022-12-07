package com.bilgeadam.week03.lesson1;

import java.util.ArrayList;
import java.util.List;

public class TekCiftSayilar {

	public static void main(String[] args)
	{
		/*	benim deneme
		
		List <Integer> sayilar = new ArrayList<>();
		
		for (int i = 0; i < 101; i++) 
		{
			
			sayilar.add(i);
			
		}
		
		List <Integer> sayilar2 = new ArrayList<>(); //çift
		List <Integer> sayilar3 = new ArrayList<>(); //tek
			
		for (int i = 0; i < sayilar.size(); i++) 
			{
	
		if(sayilar.get(i)%2==0)
		{
			sayilar2.add(i);
			
		}
		
		else {
			sayilar3.add(i);
		}
		//System.out.println(sayilar3);
		
		}
		
		
		//System.out.println(sayilar2);
		
		
		*/
		
		
		//hoca deneme
		/*
		List <Integer> teksayilar = new ArrayList<>();
		List <Integer> ciftsayilar = new ArrayList<>();
		List <Integer> ondankucukciftsayilar = new ArrayList<>();
		
		for (int a = 0; a < 10; a++) 
		{
			
			if(a%2 == 0)
			{
				ondankucukciftsayilar.add(a);
				
			}
		}
		
		for (int i = 0; i < 101; i++) 
		{
			
			if(i%2 == 0)
			{
				ciftsayilar.add(i);
				
			}
			
			else
			{
				teksayilar.add(i);
			}
			
		}
		
		System.out.println(teksayilar);
		System.out.println(ciftsayilar);
		System.out.println(ondankucukciftsayilar);
		
		for (int b = 0; b <ondankucukciftsayilar.size() ; b++) 
		{
			if(ciftsayilar.contains(ondankucukciftsayilar.get(b)))
			{
				ciftsayilar.remove(b);
			}
		}
		
		System.out.println(ciftsayilar);
		*/
		// hoca deneme 2
		List<Integer> oddNumbers = new ArrayList<>();
		List<Integer> evenNumbers = new ArrayList<>();
		//fori
		for (int i = 0; i < 101; i++) {
			if(i%2 == 0) {
				evenNumbers.add(i);
			}else {
				oddNumbers.add(i);
			}
		}		
//		System.out.println(evenNumbers);
//		System.out.println(oddNumbers);
		System.out.println(oddNumbers); ;
		List<Integer> removeNumbers = evenNumbersLessThanTen(evenNumbers);
		removeList(evenNumbers,removeNumbers);
		//System.out.println(newList);
//		System.out.println(oddNumbers);
//		System.out.println(evenNumbers);
	}
	
	public static List<Integer> evenNumbersLessThanTen(List<Integer> numbers) {
		List<Integer> removeNumbers = new ArrayList<>();
		for (int i = 0; i < numbers.size(); i++) {
			if(numbers.get(i)%2 == 0 && numbers.get(i)<10) {
				removeNumbers.add(numbers.get(i));
			}
		}
		return removeNumbers;
	}
	
	public static void removeList(List<Integer> numbers, List<Integer> removeNumbers) {
		
		for (int i = 0; i < removeNumbers.size(); i++) {
			if(numbers.contains(removeNumbers.get(i))) {
				numbers.remove(removeNumbers.get(i));
			}
		}
	
	}
	


	}


	


