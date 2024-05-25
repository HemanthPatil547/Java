package ifElseSwitch;

import java.util.Scanner;

public class DiscOnFruits {

	public static void main(String[] args)
	{
		/*
		if fruit is Apple and  quantity(q)  q<10 price of fruit is 10 & 20 <= q >=10 price  13 & q>20 price = 10
		
		if fruit is orange and  quantity(q)  q < 20 price of fruit is 10 & q >=20 price 8
		
		if fruit is banana and  quantity(q)  q < 20 price of fruit is 10 & q >=20 price 8
		
		
		*/
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a fruit name apple/orange/banana");	
		String fruit = sc.nextLine();
		
		
		System.out.println("Enter a Quantity");
		int quan = sc.nextInt();

		System.out.println(fruit);
		System.out.println(quan);
		
		
		if(fruit=="apple")
		{
			if(quan<10)
			{
				System.out.println("cost per fruit is 15");
				System.out.println("total cost " + quan + " fruits is " + quan * 15);
			}
			else if ( quan > 10 && quan <= 20)
			{
				System.out.println("cost per fruit is 13");
				System.out.println("total cost " + quan + " fruits is " + quan * 13);
			}
			else if (quan > 20)
			{
				System.out.println("cost per fruit is 10");
				System.out.println("total cost " + quan + " fruits is " + quan * 10);
			}
		}
		else if (fruit =="orange" )
		{
			if(quan < 20)
			{
				System.out.println("cost per fruit is 10");
				System.out.println("total cost " + quan + " fruits is " + quan * 10);
			}
			else if (quan >= 20)
			{
				System.out.println("cost per fruit is 8");
				System.out.println("total cost " + quan + " fruits is " + quan * 8);
			}
		}
		else if ( fruit == "banana")
		{
			if(quan <= 100)
			{
				System.out.println("cost per fruit is 5");
				System.out.println("total cost " + quan + " fruits is " + quan * 5);
			}
			else if ( quan > 100)
			{
				System.out.println("cost per fruit is 2");
				System.out.println("total cost " + quan + " fruits is " + quan * 2);
			}
		}
		else {
			System.out.println("Enter a Correct fruit");
		}
		

	}

}
