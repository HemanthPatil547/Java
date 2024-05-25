package airthmaticOperations;

import java.util.Scanner;

public class AreaCircumOFCircle {

	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner(System.in);
		//area of circle = pai * r^2
		//circum = 2pai * r
		System.out.println("Enter Radious of circle");
		float r = sc.nextFloat();
		sc.close();
		
		float Area = 3.14f * r *r;
		float circum = 2 * 3.14f * r;
		
		System.out.println("Area of Circle is : " + Area);
		System.out.println("CircumFerence of Circle is :" + circum) ;
	
		
		
	}

}
