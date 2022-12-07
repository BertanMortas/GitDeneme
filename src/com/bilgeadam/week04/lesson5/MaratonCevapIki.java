package com.bilgeadam.week04.lesson5;

public class MaratonCevapIki {
	
	public static void tekrareden(int[] arr) {
			
		int sayac=1;
		int sayi=0;
		for (int i = 0; i < arr.length; i++)
		{
			sayi = arr[i];
			for (int j = i+1; j < arr.length; j++) 
			{
				if(sayi == arr[j])
				{
					i = arr.length; // ikinci for bittiğinde ilk for u bitir
					sayac++;
				}
			}
		}
		if(sayac==1)
		{
			System.out.println("sayı yok");
		}
		else
		{
			System.out.println(sayi+" sayisi "+ sayac +" kez tekrar ediyor");
		}
		
	}

	public static void main(String[] args) {
		
		int sayilar[] = {3,5,7,3,2,4,6,8,5,9,3}	;
		
		tekrareden(sayilar);
		
		
		

	}

}
