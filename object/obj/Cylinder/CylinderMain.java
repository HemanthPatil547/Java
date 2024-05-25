package obj.Cylinder;

import java.util.Scanner;

public class CylinderMain {

	public static void main(String[] args) 
	{
		Cylinder c = new Cylinder();	
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Redious and Height of Cylinder");
		c.radious= sc.nextDouble();
		c.height=sc.nextDouble();
		
		System.out.println("Area of Cylinder is :"+c.lidArea());
		System.out.println("CIrcum of Cylinder is :"+c.circum());
		System.out.println("Volume of Cylinder is :"+c.volume());
		System.out.println("Surface of Cylinder is :"+c.surface());
		sc.close();
	}

}
