package com.bilgeadam.week03.lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PruductList {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		 List<String> product = new ArrayList<>();
		 List<String> cart = new ArrayList<>();
		 
		 product.add("0 = şeker");
		 product.add("1= tavuk");
		 product.add("2= elma");
		 product.add("3= armut");
		 product.add("4= süt");
		 product.add("5= yumurta");
		
		int input=0;
        while(input!=3) {
        System.out.println("Choose");
        System.out.println("1 - add pruduct");
        System.out.println("3 - exit");
        System.out.println("4 - show pruduct");
        input = scan.nextInt();
        
        switch (input) {
        case 1:
        	System.out.println(product);
            System.out.println("ekleme yapın");
            int add = scan.nextInt();
            
            String secim = product.get(add) ;
            cart.add(secim);
            
            break;
        case 2:
            System.out.println("ürün silme");
            
            break;
        case 3:
            System.exit(0);
            
        case 4:
        	System.out.println(cart);
        	break;
        	
        default:
            System.out.println("Yanlis giris");
            break;
        }
        
        
        }
				
       
       
        

	}

}
