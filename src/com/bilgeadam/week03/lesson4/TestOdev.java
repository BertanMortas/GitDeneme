package com.bilgeadam.week03.lesson4;

import java.util.ArrayList;

public class TestOdev {

	public static void main(String[] args)
	{
		
		Doctor doctor1 = new Doctor("bertan","mortas","kalpdoktoru",35000);
		//System.out.println(doctor1);
		//doctor1.sonmaas(doctor1.salary, doctor1.maaszam());
		
		doctor1.salary=(int)doctor1.sonmaas(doctor1.salary, doctor1.maaszam());

		Manager manager1 = new Manager("ekrem","lalala","idareşefi",24000);
		//System.out.println(manager1);
		//manager1.sonmaas(manager1.salary, manager1.maaszam());
		manager1.salary=(int)manager1.sonmaas(manager1.salary, manager1.maaszam());
		
		Nurse nurse1 = new Nurse("ayşe","dadada","cerrahihemşire",15000);
		nurse1.salary= (int)nurse1.sonmaas(nurse1.salary, nurse1.maaszam());
		
		ArrayList<Personel> list = new ArrayList<Personel>();
		
		list.add(manager1);
		list.add(doctor1);
		list.add(nurse1);
		
		for (Personel abc : list) 
		{
			System.out.println(abc);
		}
		
		ArrayList<Personel> list2 = new ArrayList<Personel>();
		
		
		
	}

}
