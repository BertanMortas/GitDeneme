package com.bilgeadam.week02.lesson2.constructor;

public class Test {

	public static void main(String[] args)
	{
		/*
		
		Person person = new Person("bertan",28);
		
		System.out.println(person);
		
		Person person2 = new Person ("çağrı",30,"coder",1000);
		System.out.println(person2);
		
		Person person3 = new Person();
		person.age=20;
		person.name="Jhon";
		person.occupation="student";
		person.salary= 1000;
		
		System.out.println(person3);
		*/
		
		//2parametreli contructorla oluşturduğum person
        Person person = new Person("bertan",28);
        person.occupation="Student";
        System.out.println(person);



       //Parametresiz contructorla oluşturduğum person
        Person person3 = new Person();
        person3.age=20;
        person3.name="John";
        person3.occupation="Student";
        person3.salary=1000;
        System.out.println(person3);
        
        //Bütün parametreli contructorla oluşturduğum person
        Person person2 = new Person("bertan",28,"Coder",1000);
        System.out.println(person2);
        
        
        Computer comp = new Computer(32,16.3,1);
        comp.ssd=2;
        
        System.out.println(comp.ram+" gb "+comp.ekran+" inc "+comp.hdd+" tb "+comp.ssd+" tb ssd isteğebağlı");
        
        Apple apple = new Apple(16,16.3,1);
        
        apple.ekranKartı= 32;
        
        System.out.println(apple.ram+" gb "+apple.ekran+" inc "+apple.hdd+" tb "+apple.ekranKartı+" tb isteğebağlı");
        
        
	}

}
