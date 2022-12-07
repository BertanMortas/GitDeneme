package com.bilgeadam.week05.lesson2.hw;

public class Test {

	public static void main(String[] args) {
		
		Account ac1 = new Account();
		AccountManager acmg = new AccountManager();
		User user1 = new User("Bertan", "Mortas", ac1);
		UserManager usmg = new UserManager();
		AdminManager admg = new AdminManager();
		
		acmg.paraYatır(ac1, 500);
		acmg.paraYatır(ac1, 2000);
		acmg.paraCek(ac1, 1000);
		acmg.hesapBilgileriniGoster(ac1);
		
		System.out.println("======================");
		
		// iki defa mail oluşturuyor
		
		usmg.otomatikEmailOlustur(user1);
		usmg.bilgileriGoster(user1);
		usmg.krediBasvurusundaBulun(ac1, 10000);
		admg.krediBasrusunuOnayla(ac1);
		
		System.out.println("======================");
		
		acmg.hesapBilgileriniGoster(ac1);
		
		System.out.println("======================");
		
		usmg.krediKartiBorcuOde(ac1, 1000);
		usmg.krediKartiBorcuOde(ac1, 1000);
		usmg.krediKartiBorcuOde(ac1, 1000);
		usmg.krediKartiBorcuOde(ac1, 1000);
		usmg.bilgileriGoster(user1);
		

	}

}
