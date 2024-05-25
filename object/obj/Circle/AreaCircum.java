package obj.Circle;

import java.util.Scanner;

public class AreaCircum {

	public static void main(String[] args) 
	{
		Circle1 c1 = new Circle1();
		Circle1 c2 = new Circle1();
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Radious of Circle1");
		c1.radious=sc.nextDouble();
		
		System.out.println("Area of Circle1 is :"+c1.area());
		System.out.println("CircumFerence of Circle1 is :" + c1.circum() );
		
		System.out.println("Enter a Radious of Circle2");
		c2.radious=sc.nextDouble();
		
		System.out.println("Area of Circle1 is :"+c2.area());
		System.out.println("CircumFerence of Circle1 is :" + c2.circum() );
		sc.close();
		
	}

}
