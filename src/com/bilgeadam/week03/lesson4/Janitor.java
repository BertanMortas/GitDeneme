package com.bilgeadam.week03.lesson4;

public class Janitor extends Personel implements IPersonel {

	public Janitor(String name, String lastname, String job, int salary) {
		super(name, lastname, job, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int maaszam() {
		// TODO Auto-generated method stub
		return 40;
	}

	@Override
	public String toString() {
		return "Janitor [name=" + name + ", lastname=" + lastname + ", job=" + job + ", salary=" + salary  + ", maaszam()=" + maaszam() + "]";
	}

}
