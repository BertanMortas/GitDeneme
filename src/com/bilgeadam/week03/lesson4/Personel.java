package com.bilgeadam.week03.lesson4;

public abstract class Personel implements IPersonel
{
	
	public String name;
	public String lastname;
	public String job;
	public int salary;
	public int zam;
	public Personel(String name, String lastname, String job, int salary) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.job = job;
		this.salary = salary;
		
	}
	public double sonmaas(double salary1, double zam1) 
	{
		double sonmaas;
		sonmaas = salary1*((zam1+100)/100);
		System.out.println("zam ile birlikte maaşınız: "+sonmaas+" olmuştur");
		
		return sonmaas;
		
	}
	
	
	
	
	
	

}
