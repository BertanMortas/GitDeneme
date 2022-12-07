package com.bilgeadam.week04.lesson4;

public class Test {

	public static void main(String[] args) {
		

		HayvanatBahcesi hb = new HayvanatBahcesi();
		
		Aslan aslan1 = new Aslan("simba",100,200);
		Aslan aslan2 = new Aslan("junior simba",500,100);
		Maymun maymun1 = new Maymun("charlie", 30, 70);
		Yilan yilan1 = new Yilan("cobra", 5, 200);
		
		
		hb.memeliHayvanEkle(aslan1);
		hb.memeliHayvanEkle(aslan2);
		hb.memeliHayvanEkle(maymun1);
		
		hb.surungenEkle(yilan1);
		
		System.out.println("===============");
		
		hb.HayvanSesCıkarsin(aslan2);
		hb.HayvanSesCıkarsin(maymun1);
		hb.HayvanSesCıkarsin(yilan1);
		System.out.println("===============");
		hb.hayvaninCinsiniBul("simba");
		hb.hayvaninCinsiniBul("charlie");
		hb.hayvaninCinsiniBul("cobra");
		System.out.println("===============");
		hb.hayvanınBilgileriniYazdir("simba");
		hb.hayvanınBilgileriniYazdir("cobra");
		hb.hayvanınBilgileriniYazdir("charlie");
		System.out.println("===============");
		hb.hayvaniHareketEttir("simba");
		hb.hayvaniHareketEttir("cobra");
		hb.hayvaniHareketEttir("charlie");

	}

}
