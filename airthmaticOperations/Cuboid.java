package airthmaticOperations;

import java.util.Scanner;

public class Cuboid {

	public static void main(String[] args) 
	{
	//Area and Volume of Cuboid 
	//Area = 2(lw+lh+wh)
	//volume = lbh
	
	Scanner sc = new Scanner(System.in);
	int l,w,h,area,vol;
	System.out.println("Enter a height,width,length");
	
	l= sc.nextInt();
	w= sc.nextInt();
	h= sc.nextInt();
	
	vol = l*w*h;
	area=2*(l*w+l*h+w*h);
	
	System.out.println("Volume of Cuboid is :"+vol);
	System.out.println("Area of Cuboid is :"+area);
	sc.close();
	
	}

}
