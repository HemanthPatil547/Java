package airthmaticOperations;

import java.util.Scanner;

public class Intrest {

	public static void main(String[] args)
	{
	//intrest = PTR/100
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Ammount");
		int p = sc.nextInt();
				
		System.out.println("Enter a Time");
		float t = sc.nextFloat();
		
		System.out.println("Enter a rate of Rate of Intrest");
		int r = sc.nextInt();
		
		float I = (p* t * r)/100;
		float b = I + p ;
		
		System.out.println("Intrest is ::" + I);
		System.out.println("Total ammount is after  "  +  t  +  "  yrs :: " + b);
		
		sc.close();
	}
		
}


