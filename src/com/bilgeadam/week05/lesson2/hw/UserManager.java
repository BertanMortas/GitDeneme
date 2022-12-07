package com.bilgeadam.week05.lesson2.hw;

public class UserManager {
	
	public String bankMail = "@xbank.com";
	//public Account ac;
	Account ac = new Account();
	// acount classı tekrar oluşuyor o yüzden sıfırlanıyor
	// extend etmeliyiz 
//	public boolean flag=false;
	
	public String otomatikEmailOlustur(User user)
	{
		String otomatikOlusanEmail;
		otomatikOlusanEmail=user.name+"."+user.surname+bankMail;
		user.setEmail(otomatikOlusanEmail);
		System.out.println("bankacılık işlem mailiniz: "+otomatikOlusanEmail);
		return user.getEmail();
	}
	public void bilgileriGoster(User user)
	{
		System.out.println("isim: "+user.name+" soyisim: "+user.surname+" hesap no: "
				+ac.getHesapNo()+" e-mail: "+user.getEmail()+" hesap bakiyeniz: "
				+ac.getBakiye()+" kalan kredi: "+ac.getIstenenKredi());
	}
	public void krediBasvurusundaBulun(Account account, int para)
	{
		ac.krediBasvurusu=true;
		//ac.setKrediBasvurusu(true);
		ac.setIstenenKredi(Double.valueOf(para));
		System.out.println(ac.getIstenenKredi()+" Değerinde kredi başvurusu yaptınız.");
		System.out.println("lütfen bekleyiniz");

	}
	public void krediKartiBorcuOde(Account account, double taksit)
	{
		if(ac.getIstenenKredi()==0)
			//if(flag==false)
		{
			System.out.println("kredi borcunuz bulunmamaktadır");
		}
		else if(ac.getIstenenKredi()!=0)
			//else if(flag==true)
		{
			ac.setIstenenKredi(ac.getIstenenKredi()-taksit);
			System.out.println();
			System.out.println("odenen borç miktari: "+taksit+" kalan kredi borcunuz"
			+ac.getIstenenKredi());
		}
		else 
		{
			System.out.println("iflerin içirisine doğru giremiyor true false durumu");
		}
	}

}
