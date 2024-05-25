package airthmaticOperations;

import java.util.Scanner;

public class RootQuad {

	public static void main(String[] args) 
	{
	//Roots of Quadratic Eqtion
		//-b+root(b^2-4ac) / 2a
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Values");
	int a,b,c;
	double r1,r2;
	
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	
	r1=(-b + Math.sqrt(b*b-4*a*c))/(2*a);
	r2=(-b - Math.sqrt(b*b-4*a*c))/(2*a);
	
	System.out.println("Roots of R1 is  :"+r1+" and R2 is :"+r2);
	sc.close();
		
	}

}
