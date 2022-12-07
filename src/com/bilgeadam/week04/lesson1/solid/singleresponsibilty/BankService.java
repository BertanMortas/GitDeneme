package com.bilgeadam.week04.lesson1.solid.singleresponsibilty;

public class BankService 
{
	/*
	 * deposit (amount, accountno)
	 * withdraw (amount, accountno)
	 * hesapcüzdanı gösterme
	 * kredi oranı bilgisini gösterme (loantype)
	 * tek kullanımlık şifre gönderme (user id)
	 */

	public double deposit(int amount, String accountNo)
	{
		// metodun kodları
		return 0;
	}
	public double withdraw(int amount, int accountno)
	{
		// metodun kodları
		return 0;
	}
	public void printPassbook()
	{
		
	}
	public double getLoanIntereset(String loantype)
	{
		if (loantype.equals("homeloan"))
		{
			return 2.30;
		}
		if (loantype.equals("carloan"))
		{
			return 1.99;
		}
		if (loantype.equals("personelloan"))
		{
			return 2.00;
		}
		return 0;
		
		
	}
	public void tekkulanimliksifre(String type)
	{
		if(type.equals("email"))
		{
			// email göndermekle alakalı bir implementasyon
			System.out.println("email gönderildi");
		}
	}
	
}
