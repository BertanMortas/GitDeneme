package com.bilgeadam.week03.lesson4;

public class Manager extends Personel implements IPersonel {

	public Manager(String name, String lastname, String job, int salary) {
		super(name, lastname, job, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int maaszam() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public String toString() {
		return "Manager [name=" + name + ", lastname=" + lastname + ", job=" + job + ", salary=" + salary  + ", maaszam()=" + maaszam() + "]";
	}

}
