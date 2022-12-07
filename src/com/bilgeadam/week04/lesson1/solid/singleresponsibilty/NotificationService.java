package com.bilgeadam.week04.lesson1.solid.singleresponsibilty;

public class NotificationService 
{
	
	public void tekkulanimliksifre(String type)
	{
		if(type.equals("email"))
		{
			// email göndermekle alakalı bir implementasyon
			System.out.println("email gönderildi");
		}
		if(type.equals("sms"))
		{
			// email göndermekle alakalı bir implementasyon
			System.out.println("sms gönderildi");
		}
		
	}

}
