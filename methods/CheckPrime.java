package methods;

import java.util.Scanner;

public class CheckPrime
{

	public static boolean isPrime(int x)
	{
		for(int i = 2;i<x/2;i++)
		{
			if(x%i==0)
			{
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter a no :");
	int x=sc.nextInt();
	boolean b = isPrime(x);
	System.out.println(x+" is prime No : "+b);
	}

}
