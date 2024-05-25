package ifElseSwitch;

import java.util.Scanner;

public class Ifday {

	public static void main(String[] args)
	{
	
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a day");
		int day = sc.nextInt();
		sc.close();
		
		if(day ==1) 
		{
			System.out.println(day +" : Monday");
		}
		else if(day ==2) 
		{
			System.out.println(day +" : Tuesday");
		}
		else if(day ==1) 
		{
			System.out.println(day +" : Monday");
		}
		else if(day ==1) 
		{
			System.out.println(day +" : Monday");
		}
		else if(day ==3) 
		{
			System.out.println(day +" : Wednessday");
		}
		else if(day ==4) 
		{
			System.out.println(day +" : Thursday");
		}
		else if(day ==5) 
		{
			System.out.println(day +" : Friday");
		}
		else if(day ==6) 
		{
			System.out.println(day +" : Saturday");
		}
		else if(day ==7) 
		{
			System.out.println(day +" : Sunday");
		}
		else
		{
			System.out.println("Enter correct day Number");
		}
	}

}
