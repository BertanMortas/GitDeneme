package com.bilgeadam.week03.lesson4;

public class Nurse  extends Personel implements IPersonel{

	public Nurse(String name, String lastname, String job, int salary) {
		super(name, lastname, job, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int maaszam() {
		// TODO Auto-generated method stub
		return 30;
	}

	@Override
	public String toString() {
		return "Nurse [name=" + name + ", lastname=" + lastname + ", job=" + job + ", salary=" + salary 
				+ ", maaszam()=" + maaszam() + "]";
	}

}
