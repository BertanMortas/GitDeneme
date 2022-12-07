package com.bilgeadam.week03.lesson4;

import java.util.Scanner;

public class OyuncakAraba {
/*
	public static void main(String[] args) 
	{
		

	}
*/
	
	public static int batteryCapacity;
	public static int distanceX;
	public static int distanceY;
	public static int locationx;
	public static int locationy;
	
	
	public void KalanBataryaOmru()
	{
	System.out.println("kalan pil ömrünüz: "+batteryCapacity);
	
		
	}
	public int xekseni(int distancex)
	{
		
		if(distancex<batteryCapacity)
		{
		batteryCapacity=batteryCapacity-Math.abs(distancex);
		locationx += distancex;
		System.out.println("araç x yönünde "+distancex+" metre ilerledi");
		System.out.println("kalan pil ömrü "+batteryCapacity);
		}
		else {
			System.out.println("araç bu kadar ilerleyemez şarj yeterli değil");
		}
		return batteryCapacity;
	}
	public int yekseni(int distanceX)
	{
		
		if(distanceX<batteryCapacity)
		{
		batteryCapacity=batteryCapacity-Math.abs(distanceX);
		locationy +=distanceX;
		System.out.println("araç x yönünde "+distanceX+" metre ilerledi");
		System.out.println("kalan pil ömrü "+batteryCapacity);
		}
		else {
			System.out.println("araç bu kadar ilerleyemez şarj yeterli değil");
		}
		return batteryCapacity;
	}
	public int sarjet()
	{
		
		batteryCapacity = 100;
		if(locationy<0)
		{
			System.out.println("y eksenin de aşağı ilerlemeniz: "+Math.abs(locationy));
		}
		else {
			System.out.println("y eksenin de yukarı ilerlemeniz: "+locationy);
		}
		if(locationx<0)
		{
			System.out.println("x eksenin de sola ilerlemeniz: "+Math.abs(locationx));
		}
		else {
			System.out.println("x eksenin de sağa ilerlemeniz: "+locationx);
		}
		
		
		return batteryCapacity;
	}
	
	public void	displaymenu()
	{
	System.out.println("lütfen seçim yapınız: ");
	System.out.println("1: x yönünde ilerlet ");
	System.out.println("2: y yönünde ilerlet");
	System.out.println("3: kalan pil ömrü ");
	System.out.println("4: sarj et ");
	System.out.println("5: çıkış ");
	}
}
