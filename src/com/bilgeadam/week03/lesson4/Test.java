package com.bilgeadam.week03.lesson4;

import java.util.Scanner;

public class Test {
	

	public static void main(String[] args) 
	{
		OyuncakAraba a = new OyuncakAraba();
		boolean durum = true;
		
		int input=0;
        while(durum) {
        	
        	a.displaymenu();
        	Scanner scan = new Scanner(System.in);
        input = scan.nextInt();
        switch (input)
        {
        case 1:
        	
    		System.out.println("aracın ne kadar gideceğii giriniz: ");
    		int distancex= scan.nextInt();
        	a.xekseni(distancex);
            break;
        case 2:
        	
    		System.out.println("aracın ne kadar gideceğii giriniz: ");
    		int distancey= scan.nextInt();
        	a.yekseni(distancey);
            break;
        case 3:
        	a.KalanBataryaOmru();
            break;
        case 4:
        	a.sarjet();
            break;
        case 5:
        	durum = false;
        	break;

        }

}
	}
}
