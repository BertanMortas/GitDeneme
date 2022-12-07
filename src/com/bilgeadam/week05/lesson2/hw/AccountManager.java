package com.bilgeadam.week05.lesson2.hw;

public class AccountManager 
{
	Account ac = new Account();
	// üsttekinin yerine 	public Account ac; 	olur muydu sor.
	
	public double paraYatır(Account account,double miktar) {
		
		// get set metodları kontrol et
		// çalışıyor
		
		if(miktar<10000)
		{
			ac.setBakiye(ac.bakiye+miktar);
			System.out.println("yatırılan miktar "+miktar+" güncel bakiyeniz "+ac.getBakiye());
		}
		else
		{
			System.out.println("yatırdığınız miktar 10.000 TL nin altında olmalıdır");
		}

		return ac.getBakiye();
	}
	
	public double paraCek(Account account,double miktar) {
		
		if(miktar<ac.getBakiye())
		{
			ac.setBakiye(ac.getBakiye()-miktar);
			System.out.println("çekilen miktar "+miktar+" güncel bakiyeniz "+ac.getBakiye());
		}
		else
		{
			System.out.println("Bakiyeniz yetersiz");
		}

		return ac.getBakiye();

	}
	
	public void hesapBilgileriniGoster(Account account) {

		System.out.println("hesap no: " + ac.hesapNo+" bakiyeniz: "+ac.getBakiye());
		
	}
	

}
