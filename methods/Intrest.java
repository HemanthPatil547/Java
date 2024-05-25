package methods;

import java.util.Scanner;

public class Intrest {

	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter p t r values");
		int p = sc.nextInt();
		float t = sc.nextFloat();
		float r = sc.nextFloat();
		float I =Intrst(p,t,r);
	
		System.out.println("Intrest is ::" + I);
		System.out.println("Total ammount is after  "  +  t  +  "  yrs :: " + (p+I));

	}

	
	public static float Intrst(int p,float t,float r)
	{
		float I = (p* t * r)/100;
		return I;
	}

}
