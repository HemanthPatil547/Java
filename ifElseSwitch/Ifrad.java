package ifElseSwitch;

import java.util.Scanner;

public class Ifrad {

	public static void main(String[] args) 
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a Number");
	String s = sc.nextLine();
	sc.close();
	
	if(s.matches("[01]+"))
	{
		System.out.println("Binary Radix = 2");
	}
	else if (s.matches("[0-7]+"))	
	{
		System.out.println("Octal Radix = 8");
	}
	
	else if (s.matches("[0-9]+"))
	{
		System.out.println("Decimal Radix = 10");
		
	}
	
	else if (s.matches("[0-9A-F]+"))
	{
		System.out.println("Hexa Radix = 16");
		
	}
		
	else
	{
		System.out.println("Enter a Correct Number");
	}
	}

}
