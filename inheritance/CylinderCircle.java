package inheritance;

import java.util.Scanner;


public class CylinderCircle {

	public static void main(String[] args) {
		Cylinder c = new Cylinder();	
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Redious and Height of Cylinder");
		c.radius= sc.nextDouble();
		c.height=sc.nextDouble();
		
		System.out.println("Area of Circle is :"+c.area());
		System.out.println("Perimeter of circle is :"+c.perimeter());
		System.out.println("Cylinder details");
		System.out.println("Area of Cylinder is :"+c.area());
		System.out.println("CIrcum of Cylinder is :"+c.perimeter());
		System.out.println("Volume of Cylinder is :"+c.volume());
		System.out.println("Surface of Cylinder is :"+c.surface());
		sc.close();

	}

}

class Circle
{
    public double radius;
    
    public double area()
    {
        return Math.PI * radius *radius;
    }
    
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
   
}

class Cylinder extends Circle
{
    public double height;
    
    public double volume()
    {
        return area()*height;
    }
    public double surface()
	{
		return 2*area()+perimeter()*height;
		//2pr^2+2pirh
		
	}
    
}
