package com.bilgeadam.week01;

import java.util.Scanner;

public class MathLib {

	public static void main(String[] args) 
	{
		
		/*double x =0;
		
		System.out.println(Math.cos(x));
		
		double pi = Math.PI;
		
		System.out.println(pi);
		
		double z= Math.pow(pi, 6);
		
		System.out.println(z);
		
		
		double A;
		double B;
		double a;
		double b;
		double C;
		double D;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ilk kenarı giriniz: ");
		
		A = scan.nextDouble();
		
		System.out.println("ilk açıyı giriniz: ");
		
		a = scan.nextDouble();
		
		System.out.println("ikinci kenarı giriniz: ");
		
		B = scan.nextDouble();
		
		System.out.println("ikinci açıyı giriniz: ");
		
		b = scan.nextDouble();
		
		C= (((Math.pow(A, 2)) + (Math.pow(B, 2)) - (2*A*B*(Math.cos(180-(a+b))))));
		
		D = Math.sqrt(C);
		
		System.out.println("üçüncü kenar: " +D);
		
		*/
		
		 {
			
			double x,y,z,a,b,c;
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter first angle : ");
			x = scanner.nextDouble();
			System.out.println("Enter line length for first angle : ");
			a = scanner.nextDouble();
			System.out.println("Enter second angle : ");
			y = scanner.nextDouble();
			System.out.println("Enter line length for second angle : ");
			b = scanner.nextDouble();
			//c^2=a^2 + b^2 - 2abcos(C)
			
			z= 180-(x+y);
			double zRad = Math.toRadians(z);
			
			double temp = Math.pow(a, 2) + (b*b) - (2*a*b*(Math.cos(zRad)));
			
			c = Math.sqrt(temp);
			
			System.out.println("Third angşe is : " +z);
			System.out.println("Third line length is : "+ c );
			
		}
		
	}

}
