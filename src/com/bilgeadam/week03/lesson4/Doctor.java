package com.bilgeadam.week03.lesson4;

public class Doctor extends Personel implements IPersonel {
	
	
	

	public Doctor(String name, String lastname, String job, int salary) {
		super(name, lastname, job, salary);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public int maaszam() 
	{
		
		return 10;
	}

	@Override
	public String toString() {
		return "Doctor [name=" + name + ", lastname=" + lastname + ", job=" + job
				+ ", salary=" + salary +  ", maaszam()=" + maaszam() + "]";
	}

	

}
