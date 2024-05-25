package basic;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) 
	{
	System.out.println("Enter a two Numbers");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = a+b;
	System.out.println(c);
	System.out.println("Sum of "+a+"  and "+b+" is "+(a+b));
//	System.out.println(Integer.MIN_VALUE);
	sc.close();
	}

}
