package com.bilgeadam.week05.lesson2.hw;

public class User 
{
	public String name;
	public String surname;
	public String email;
	public Account account;
	
	
	
	
	public User(String name, String surname, Account account) {
		super();
		this.name = name;
		this.surname = surname;
		this.account = account;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
