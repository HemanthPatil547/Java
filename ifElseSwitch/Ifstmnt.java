package ifElseSwitch;

import java.util.Scanner;

public class Ifstmnt {

	public static void main(String[] args) 
	{
		//attendence eligble or not
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter total no of clss");
		int cls = sc.nextInt();
		System.out.println("enter student attended clss");
		int at = sc.nextInt();
		
		float present = (at*100)/cls;
		sc.close();
		if(present > 100) 
		{
			System.out.println("attendent class is must be less than total classes");
		}
		else if(present >= 75.05f)
		{
			System.out.println("Student is Eligible for Examination");
		}
		else
		{
			System.out.println("not eligible");
		}
	}

}
