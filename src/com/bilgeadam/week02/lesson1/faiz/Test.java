package com.bilgeadam.week02.lesson1.faiz;

public class Test {

	public static void main(String[] args)
	{
	
		YapiKredi yapı = new YapiKredi();
		
		yapı.faizoranı(100000 , 100);
		
		Garanti garanti = new Garanti();
		
		garanti.faizoranı(100000, 100);
		
		Isbankasi is = new Isbankasi();
		 is.faizoranı(100000, 100);

	}

}
