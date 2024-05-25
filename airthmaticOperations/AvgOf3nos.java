package airthmaticOperations;

import java.util.Scanner;

public class AvgOf3nos {

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 3 Nos");
		int n1,n2,n3;
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		
		float avg = (n1+n2+n3)/3;
		System.out.println("Average is :"+avg);

	}

}
