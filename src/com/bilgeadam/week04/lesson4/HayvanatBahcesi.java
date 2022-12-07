package com.bilgeadam.week04.lesson4;

import java.util.ArrayList;
import java.util.List;

public class HayvanatBahcesi 
{
	
	List<Hayvan> hayvanlarlist = new ArrayList<>();
//	Hayvan hayvan;
//	String hayvanSinifi =hayvan.getClass().getSuperclass().getSimpleName();
	
	public void memeliHayvanEkle(MemeliHayvan m)
	{
		hayvanlarlist.add(m);
	//	System.out.println(hayvanlarlist);
	}
	public void surungenEkle(Surungen s)
	{
		hayvanlarlist.add(s);
	//	System.out.println(hayvanlarlist);
	}
	public void HayvanSesCıkarsin(Hayvan h)
	{
		System.out.println(h.ad+ " "+ h.sesCıkar());
	}
	public void hayvaninCinsiniBul(String hayvanAdi)
	{
		int count = 0;
		for (Hayvan hayvan : hayvanlarlist) 
		{
			if(hayvan.ad.equals(hayvanAdi))
			{
				count++;
				System.out.println(hayvanAdi + " bir "+ hayvan.getClass().getSuperclass().getSimpleName());
			}
		}
		if (count==0)
		{
			System.out.println("hayvan bulunamadı.");
		}
	}
	public void hayvanınBilgileriniYazdir(String hayvanAdi)
	{int count = 0;
		for (Hayvan hayvan : hayvanlarlist) 
		{
			if(hayvan.ad.equals(hayvanAdi))
			{	
				count++;
				System.out.println(hayvan);
			}
		}
		if (count==0)
		{
			System.out.println("hayvan bulunamadı.");
		}
	}
	public void hayvaniHareketEttir(String hayvanAdi)
	{
		for (Hayvan hayvan : hayvanlarlist) 
		{
			if(hayvan.ad.equals(hayvanAdi))
			{	
				// soruda bu kısım yeterli
				if(hayvan instanceof MemeliHayvan)
				{
					System.out.println(hayvanAdi+ " isimli "+ hayvan.getClass().getSimpleName()+ "  yürüyor");
				}
				if(hayvan instanceof Surungen)
				{
					System.out.println(hayvanAdi+ " isimli "+ hayvan.getClass().getSimpleName()+ "  sürünüyor");
				}
				// ikinci kısım için 02.12.2022 sabah dersine bak saat 03.15 !!!
			}
		}
	}
	
	
	
	
	
	
//	public void hayvaninCinsiniBul2(String hayvanAdi) // tunç çözümü
//	{
//		int count = 0;
//        for(Hayvan hayvan : hayvanlarlist) {
//            
//            if(hayvan.ad.equals(hayvanAdi)) {
//                count++;
//                if(hayvan instanceof MemeliHayvan)
//                {
//                    System.out.println(hayvan.ad + " bir Memeli Hayvandır.");
//                    
//                } else if(hayvan instanceof Surungen){
//                    System.out.println(hayvan.ad + " bir Surungen Hayvandır." );
//                    
//                }
//            }
//        }
//        if(count==0) {
//            System.out.println( hayvanAdi + " isimli bir hayvan hayvanat bahcesinde yok.");
//        }
//	}

}
