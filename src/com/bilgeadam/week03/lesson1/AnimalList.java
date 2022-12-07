package com.bilgeadam.week03.lesson1;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class AnimalList {

	public static void main(String[] args)
	{
		List <Integer> numbers = new ArrayList<>();
		List<String> animals = new ArrayList<>();
		
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Tiger");
		animals.add("Lion");
		animals.add("Mouse");
		animals.add("Elephant");
		animals.add("Bird");
		animals.add("Fish");
		animals.add("Horse");
		animals.add("Frog");
		
		// 	listeye ulaşma belirli bir stringe
		//animals.get(0);
		
		//System.out.println(animals.get(2));
		
		// 	listeden çıkarma
		
		//animals.remove(4);

		//System.out.println(animals.remove(4));
		
		// 	listedeki elemanı değiştirme
		
		animals.set(5, "Platypus");
		// elemanları foeach ile yazdırma
		
		for (String str : animals)
		{
		//	System.out.println(str);
		}
		// array büyüklüğü görme
		animals.size();
		
	//	System.out.println(animals.size());
		
		// liste dolu mu boş mu
		
	//	System.out.println(animals.isEmpty());
	//	System.out.println(numbers.isEmpty());
		
		// liste de var mı yok mu
		
	//	System.out.println(animals.contains("Dog"));
	//	System.out.println(animals.contains("Monkey"));
		
	//	Scanner scan = new Scanner(System.in);
		
	//	String input = scan.nextLine();
	//	boolean answer = animals.contains(input.toLowerCase());
	//	System.out.println(answer);
		
		// nerde olduğunu söylüyor
		animals.indexOf("Dog");
		
	//	System.out.println(animals.indexOf("Frog"));
		
		// listede eleman değiştirme
		
		animals.set(1, "Giraffe");
		
		for (String str : animals)
		{
		//	System.out.println(str);
		}
		//	içindekilerden yeni bir liste oluşturmak 
		
		List<String> animals2 = animals.subList(2, 6);
		
		for (String str : animals2) 
		{
		//	System.out.println(str);
			
		}
		// 	listeyi terse çevirme
		Collections.reverse(animals);
		
		for (String string : animals) {
	//		System.out.println(string);
			
		}
		
		// alafabetik sıraya alma
		Collections.sort(animals);
		
		for (String string : animals) 
		{
			//	System.out.println(string);	
		}
		
		
		// liste deki elemanları silme
		
	//	animals.clear();
		
		for (String string : animals) 
		{
			//	System.out.println(string);	
		}
		
		
		
	}

}
