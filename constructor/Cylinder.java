package constructor;

import java.util.Scanner;


public class Cylinder {

	
	private double radious;
	private double height;
	
	
	public double getHeight()
    {
        return height;
    }
    public double getRadious()
    {
        return  radious;
    }
    
    public void setHeight(double h)
    {
        if(h>=0)
            height=h;
        else
            height=0;
    }
    public void setRadius(double r)
    {
        if(r>=0)
            radious=r;
        else
            radious=0;
    }
    public void Dimensions(double h,double r)
    {
        height=h;
        radious=r;
    }
    
	public Cylinder()
	{
		radious = 1;
		height=2;
	}
	public Cylinder(double r,double h)
	{
		radious = r;
		height=h;
	}
	public double lidArea()
	{
		return Math.PI*radious*radious;
	}
	public double circum()
	{
		return 2*Math.PI*radious;
		
	}
	public double volume()
	{
		//pir^2h
		return lidArea()*height;
		
	}
	public double surface()
	{
		return 2*lidArea()+circum()*height;
		//2pr^2+2pirh
		
	}
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner (System.in);
		System.out.println("\n\nEnter a Redious and Height of Cylinder");
		double r= sc.nextDouble();
		double h=sc.nextDouble();
		
		
		Cylinder c = new Cylinder();
		c.setHeight(h);
	    c.setRadius(r);
	    c.Dimensions(h, r);
		System.out.println("empty cunstructor");
		System.out.println("Area of Cylinder is :"+c.lidArea());
		System.out.println("CIrcum of Cylinder is :"+c.circum());
		System.out.println("Volume of Cylinder is :"+c.volume());
		System.out.println("Surface of Cylinder is :"+c.surface());
		
		
		Cylinder c1 = new Cylinder(r,h);
		System.out.println("height is :"+h+"\nradious is :"+r);
		System.out.println("Area of Cylinder is :"+c1.lidArea());
		System.out.println("CIrcum of Cylinder is :"+c1.circum());
		System.out.println("Volume of Cylinder is :"+c1.volume());
		System.out.println("Surface of Cylinder is :"+c1.surface());
		
		sc.close();
	}


		
	}


