package com.bilgeadam.week02.lesson4.arrays;

import java.util.Iterator;

public class Arrays {

	public static void main(String[] args) 
	{
		
		double[] data;
		
		data = new double[10];
		
		double [] data2 = new double [5];
		
		int [] age = {12,4,5,6,7};
		
		int [] age2 = new int[5];
		age2[0]= 12;
		age2[1]=4;
		age2[2]=5;
		
		
		//System.out.println("first element: "+age[0]);
		//System.out.println("second element: "+age[1]);
		//System.out.println("fifth element: "+age[4]);
		
		//System.out.println(age.length);
		
		//loop throught the array
		// fori döngüsü
		
		for (int i = 0; i< age.length; i++)
		{
			
			//System.out.println(age[i]);
			
		}
		//foreach
		
		for(int i : age) {
			
			//System.out.println(i);
		}
		
		//arrays.toString
		
		//System.out.println(java.util.Arrays.toString(age));
		
		
		// 2, -9, 0, 5, 12, -25, 22, 9, 8, 12
		
		int [] sayilar = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
		float toplam=0;
		
		for (int i = 0; i < sayilar.length; i++)
		{
			
			toplam = toplam + sayilar[i];
			
		}
		float ortalama = toplam/sayilar.length;
		System.out.println(ortalama);
		
		System.out.println(toplam);
		
		
		// max min
		
		
		int[] numb = {56,34,1,8,101,-2,-33};
		
		int min = numb[0];
		int max = numb[0];
		
		for (int j :numb)
		{
			
			if (j<min)
			{
				min=j;
			}
			
			if (j>max)
			{
				max=j;
			}
			
		}
		
		System.out.println("max değer: "+max+" min değer: "+min);
							
			
		}	
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


