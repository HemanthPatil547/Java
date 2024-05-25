package ifElseSwitch;

import java.util.Scanner;

public class IfLeaf {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Year");
		int y = sc.nextInt();
		sc.close();
		
		if(y%400==0)
		{
			System.out.println(y +" this is Leaf Year");
		}
		else if (y%4==0 && y%100 !=0)
		{
			System.out.println(y +" this is Leaf Year");
		}
		else 
		{
			System.out.println(y +" this is Not Leaf Year");
		}
	}

}
