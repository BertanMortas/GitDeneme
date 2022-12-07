package com.bilgeadam.week04.lesson2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) 
	{
		
		List<Person>personList = new ArrayList<>();
		
	//	Person person = new Person("Whittaker","Godleman","Male",32);
		
		personList.add(new Person("Whittaker","Godleman","Male",32));
		personList.add(new Person("Merola","Wrout","Female",32));
		personList.add(new Person("Melosa","Courage","Female",14));
		personList.add(new Person("Sydney","Cullington","Female",74));
		personList.add(new Person("Sherwin","Ogley","Male",14));
		personList.add(new Person("Dukie","Malpass","Male",30));
		personList.add(new Person("Jarrett","Fearick","Male",77));
		personList.add(new Person("Willie","Childerhouse","Male",31));
		personList.add(new Person("Berky","Tollmache","Male",73));
		personList.add(new Person("Nanete","Blunsden","Female",81));

		
		Map<String,Integer>filteredmap =
		
		personList.stream().filter(person -> person.age<50)
		.collect(Collectors.toMap(person->person.name, person->person.age));
		
		filteredmap.forEach((key,value)-> System.out.println(key+"-"+value));
		
		
		System.out.println("====================");

		personList.stream().filter(person -> person.age<35)
		.filter(person->person.gender.equals("Male"))
		.forEach(Person::Speak);
		
		System.out.println("====================");
		
		Set<Person>personList2 = 
		
		personList.stream().filter(person->person.gender.equals("Male"))
		.map(person->new Person (person.name,person.lastname,person.gender,person.age+15))
		.collect(Collectors.toSet());
		
		personList2.stream().forEach(person->System.out.println(person));
	}

}
