package obj.Rectangle;

import java.util.Scanner;

public class RectMain {

	public static void main(String[] args) 
	{
		RectAngle R1 = new RectAngle();
		RectAngle R2 = new RectAngle();
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Length and Breadth of RectAngle");
		R1.length=sc.nextDouble();
		R1.breadth=sc.nextDouble();
		
		System.out.println("Area of RectAngle is :"+R1.area());
		System.out.println("Perimeter of RectAngle is :" + R1.perimeter() );
		
		System.out.println("Enter a Length and Breadth of RectAngle");
		R2.length=sc.nextDouble();
		R2.breadth=sc.nextDouble();
		System.out.println("Area of RectAngle is :"+R2.area());
		System.out.println("Perimeter of RectAngle is :" + R2.perimeter() );
		System.out.println("It is Square  :"+ R2.isSqure());
		
		sc.close();
		
	}

}
