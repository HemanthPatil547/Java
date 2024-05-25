package methods;

import java.util.Scanner;

public class AreaCircum {
	
	public static double area(float r)
	{
		double f1 = Math.PI * r *r;
		return f1;		
		
	}
	public static double circum(float r)
	{
		double f3 = 2 * Math.PI * r;
		return f3;
	}


	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a radious of circle");
		int r = sc.nextInt();
		double a=area(r);
		double c=circum(r);
		
		System.out.println("Area of Circle is : " + a);
		System.out.println("CircumFerence of Circle is :" + c) ;
		sc.close();
		
	}

}
