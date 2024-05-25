package airthmaticOperations;

import java.util.Scanner;

public class FToCelsious {

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter a F value");
	float f ;
	f = sc.nextFloat();
	double cel = (f - 32) * 5 /9 ;
	sc.close();
	System.out.println(" converted celsious is  :" + cel);
	
	}

}
