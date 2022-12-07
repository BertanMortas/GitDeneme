package com.bilgeadam.week03.lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductList2 
{
	public static void main(String[] args) 
	{
		
		

		Scanner scan = new Scanner(System.in);
		 List<String> product = new ArrayList<>();
		 List<String> cart = new ArrayList<>();
		 
		 product.add("Chips");
		 product.add("Coke");
		 product.add("Sugar");
		 product.add("Olive");
		 product.add("Milk");
		 product.add("Bread");
		 product.add("Tea");
		 product.add("Egg");
		 product.add("Yoghurt");
		
		 
		
		boolean conditions = true;
		int input=0;
        while(conditions) {
        	
        	displaymenu();
        	
        input = scan.nextInt();
        switch (input) {
        case 1:
        	pruductslist(product);
            
            break;
        case 2:
        	productadding(product,cart);
            
            break;
        case 4:
        	conditions = false;
        	break;
            
        case 3:
        	cartlist(cart);
        	
        	break;
        	
        default:
            System.out.println("Yanlis giris");
            break;
          
        }
        
        
        }
				
       
        System.out.println();
		
	}

	private static void cartlist(List<String>cart) 
	{
		for (String string : cart) 
		{
			System.out.println(string);
		}
		
	}

	private static void displaymenu() {
		System.out.println("lütfen seçim yapınız: ");
		System.out.println("1: ürün listesi ");
		System.out.println("2: ürün ekleme ");
		System.out.println("3: eklenen ürünlerin listesi ");
		System.out.println("4: çıkış ");
		
	}

	private static void pruductslist(List<String> product) 
	{
		for (int i = 0; i < product.size(); i++)
		{
			
			System.out.println((i+1) + " - " + product.get(i) );
			
		}

		
	}

	private static void productadding(List<String> product,List<String>cart) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("eklenecek ürünü seçin");
		int secim = scan.nextInt();
		cart.add(product.get((secim-1)));
		System.out.println("eklenen ürün: "+product.get((secim-1)));
		
	}

}
