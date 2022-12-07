package com.bilgeadam.week04.lesson2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamLearning {

	public static void main(String[] args) 
	{
		
		List<Integer>list = new ArrayList<>();
		
		list.add(25);
		list.add(12);
		list.add(3);
		list.add(89);
		list.add(25);
		list.add(44);
		list.add(100);
		list.add(7);
		list.add(63);
		
//		for (Integer number : list) {
//			
//			System.out.println(number);
//		}
		
		//foreach bununla aynı
		
//		list.stream().forEach(number -> System.out.println(number));
		
		// filter
		
//		list.stream()
//		.filter(number-> number>60)
//		.forEach(number -> System.out.println(number));
//		
		// distinct
		
		// tekrar eden sayının gelmemesi
//		list.stream()
//		.distinct()
//		.forEach(number -> System.out.println(number));
		
		// sorted
		
//		list.stream()
//		.sorted().forEach(number -> System.out.println(number));
		
		//sorted v2
		
//		list.stream().sorted(Comparator.reverseOrder())
//		.forEach(number -> System.out.println(number));
		
		//limit
		//ilk beş elemanı getirdi
//		list.stream()
//		.limit(5)
//		.forEach(number -> System.out.println(number));
		
		// skip
		
//		list.stream()
//		.skip(5)
//		.limit(2)
//		.forEach(number -> System.out.println(number));
		
		// count
//		long x =list.stream().filter(number -> number<40)
//		.distinct().count();
//		
//		System.out.println(x);
		
		// anymatch
		
//		boolean match =list.stream()
//		.anyMatch(number -> number<5);
//		System.out.println(match);
		
		// allMatch
		// eğer bütün list elemanları 5 ten küçük olsaydı true verecekti
		
//		boolean match2=
//		list.stream().allMatch(number -> number<5);
//		
//		System.out.println(match2);
		
		// noneMatch
		// hiçbir eleman karşılayamazsa true dönüyor
//		boolean match3=
//		list.stream().noneMatch(number -> number<2);
//		
//		System.out.println(match3);
		
		//map
		//orjinal listeyi etkilemiyor herhangi bir stream methodu dahil
//		list.stream().map(number ->number*2)
//		.forEach(number -> System.out.println(number));
		
		//map
		
		list.stream().map(number -> Math.sqrt(number))
		.forEach(number ->System.out.println(number));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
