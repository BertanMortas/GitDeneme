package com.bilgeadam.week05.lesson2.hw;

public class AdminManager 
{
	Account ac = new Account();
	UserManager um = new UserManager();
	public void krediBasrusunuOnayla(Account account)
	{
		//um.flag=true;
		if(ac.krediBasvurusu == true)
		{
			System.out.println("kredi başvurunuz onaylandı");
			ac.setBakiye(ac.getIstenenKredi()+ac.getBakiye());
		}
		else if(ac.krediBasvurusu == false)
		{
			System.out.println("Kredi başvurunuz bulunmamaktadır");
		}
	}
	public void krediBasrusunuReddet(Account account)
	{
		//um.flag=false;
		if(ac.krediBasvurusu == true)
		{
			System.out.println("kredi başvurunuz onaylanmadı");
			ac.setIstenenKredi(0);
		}
		else if(ac.krediBasvurusu == false)
		{
			System.out.println("krediniz başvurunuz bulunmamaktadır");
		}
	}
}
