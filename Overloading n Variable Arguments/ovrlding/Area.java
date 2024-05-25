package ovrlding;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a length and Breadth of Rectangle");
		double l = sc.nextDouble();
		double b = sc.nextDouble();
		System.out.println("area of Recatangle is"+area(l,b));
		
		System.out.println("Enter a radious of Circle");
		double r = sc.nextDouble();
		System.out.println("area of Circle is"+area(r));
		
		System.out.println("Enter a A, B and h of Trypezium");
		double a = sc.nextDouble();
		double B = sc.nextDouble();
		double h = sc.nextDouble();
		System.out.println("area of Trypezium is"+area(a,B,h));
		sc.close();
	}

	
	static double area(double l , double b)
	{
		
		return l*b;
		
	}
	static double area(double r)
	{
		return Math.PI*r*r;
		
	}
	static double area(double a, double b,double h)
	{
		return (1/2)*(a+b)*h;
		
	}
}
