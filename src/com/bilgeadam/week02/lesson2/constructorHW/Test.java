package com.bilgeadam.week02.lesson2.constructorHW;

public class Test {

	public static void main(String[] args) {
		
		Address adress = new Address("ankara");
		Student s = new Student(adress);
		s.getadres();
		System.out.println(s.adres.adresler);
		

	}

}
