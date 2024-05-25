package ifElseSwitch;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) 
	{
	
		// if cost >1000  dicscount is 10%
		//cost = num of product X 100 
		
		System.out.println("enter number of product");
		Scanner s =new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		
		int cost = n * 100 ;
		if (cost >= 1000)
		{
			int disc = cost * 10 /100;
			System.out.println( " Discount of Product is " + disc);
			int d = cost - disc;
			System.out.println(" Total Ammount u pay  : "+ d);
		}
		else 
		{
			System.out.println("Total Ammount u pay  :" + cost );
		}
	
		
	}

}
