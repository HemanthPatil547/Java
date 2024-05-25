package airthmaticOperations;

import java.util.Scanner;

public class Area3 {

	public static void main(String[] args) 
	{
		//Area of Triangle  with 3 sides 
		// s = 1\2(a+b+c)
		//area= root of(s(s-a)(s-b)(s-c)
		
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		float s,area;
		
		System.out.println("Enter a Side of Triangle");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		s= (a+b+c)/2;
		System.out.println(s);
		
		area=(float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of Triangle is "+ area);
		sc.close();

	}

}
