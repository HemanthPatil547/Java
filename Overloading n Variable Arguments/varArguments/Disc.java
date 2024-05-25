package varArguments;

import java.util.Scanner;

public class Disc {

	
	public static double Disc(int prod,int price)
	{
		int cost = prod*price;
		int c;
		if(cost>=1000 )
		{
			c = 20*cost/100;
			cost = cost - c;
		}
		else if (cost<1000&& cost>500 )
		{
			c = 10*cost/100;
			cost = cost - c;
		}
		else if (cost<500 )
		{
			c = 5*cost/100;
			cost = cost - c;
		}
		return cost;
	}
	public static void main(String[] args)
	{
	System.out.println("enter a product no");
	Scanner sc = new Scanner (System.in);
	int p = sc.nextInt();
	System.out.println(("enter price per product"));
	int c = sc.nextInt();
	
	double cost = Disc(p,c);
	System.out.println("cost of after Discount "+cost);
	
	}

}
