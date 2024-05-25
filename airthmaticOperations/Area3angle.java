
//using 2 sides only
package airthmaticOperations;

import java.util.Scanner;

public class Area3angle {

	public static void main(String[] args)
	{
		//1/2 X breadth X Height
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter Height of Trinagle");
		int h = sc.nextInt();
		System.out.println("Enter Breadth of Triangle");
		int b = sc.nextInt();
		
		System.out.println("Area of Tringle is   :"+(0.5f*h*b));
		sc.close();
	}

}
