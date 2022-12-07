package com.bilgeadam.week03.lesson1;

import java.util.ArrayList;
import java.util.List;

public class TekCiftDeneme {

	public static void main(String[] args) 
	{
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
		
		else if (sayilar.get(i)%2!=0)
		{
			sayilar3.add(i);
		}
	//	System.out.println(sayilar3);
	//	System.out.println(sayilar2);
		
		}
		
		
	//	System.out.println(sayilar2);
		

	}

}
