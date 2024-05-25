package methods;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner (System.in);
	System.out.println("enter a 2 No's :");
	int m = sc.nextInt();
	int n = sc.nextInt();
	
	System.out.println("GCD of "+m +" and "+n+" is  :" +gcd(m,n));
	}

	
	static int gcd(int m,int n)
	{
		while(m!=n)
		{
			if(m>n)
			{
				m=m-n;
			}
			else
			{
				n=n-m;
			}
		}
		return n;
		
	}
}
