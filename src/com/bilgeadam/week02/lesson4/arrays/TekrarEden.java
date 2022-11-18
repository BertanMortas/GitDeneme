package com.bilgeadam.week02.lesson4.arrays;

public class TekrarEden {
	public static void main(String[] args) 
	{
		
		
		int[] arr = {3,7,12,43,54,43,28,3,19,-24,-19};
		
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				
				if (arr[i]==arr[j])
				{
					//System.out.println(arr[i]);
				}
				
			}
			
		}
		
		int [] aray = {3,7,12,3,43,54,43,28,3,19,-24,-19,43};
		
		for (int i = 0; i < aray.length; i++) 
		{
			
			for (int j = 0; j < aray.length; j++)
			{
				
				if(aray[i] == aray[j]) 
				{
					
					System.out.println(aray[i]);
					
				}
				
				else 
				{
					
					double[] data;
					
					data = new double[aray.length];
					
					//data[i] 
					
				}
					
				
			}
			
		}
		
		
		
		
		
		
		
	}

}





// sıralamaya çalış kendin


//odev şu olacak arr dizisine bir adet 3 ve 43 daha ekleyince program çıktısı
//bozuluyor bunun önüne geçmeye çalışılacak
//int[] arr = {3,7,12,3,43,54,43,28,3,19,-24,-19,43};
//eş gelen sayı bulunca arrayden çıkar fikir
// bir daha koyup sayaç yapıp sayaç 0 okey 1 se yaz 2 olursa yazma

