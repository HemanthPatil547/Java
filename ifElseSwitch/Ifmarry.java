package ifElseSwitch;

import java.util.Scanner;

public class Ifmarry {

	public static void main(String[] args) 
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Gender M/F m/f");
		String c = sc.nextLine();
		System.out.println("Enter a Age");
		int x=sc.nextInt();
		
		if ( c == "M"||c=="m" && x>=21)
		{
			System.out.println("Boy is Eligible For Marriage");
		}
		else if ( c == "F"||c=="f" &&  x >=18 )
		{
		System.out.println("Girl is eligible for Marriage");
		}
		else {
			System.out.println("not eligible");
		}
		
	}

}
