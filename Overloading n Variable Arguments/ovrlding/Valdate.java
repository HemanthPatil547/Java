package ovrlding;

import java.util.Scanner;

public class Valdate {
	
	 public static  boolean Val(String Name)
	{
		return (Name.matches("[a-z]"));
		
	}
	 static boolean val(int age)
	 {
		return age<19 && age>7;
		 
	 }

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter A name for Checking Validation");
		String Name = sc.nextLine();
	System.out.println(Name + " validate :"+Val(Name));
	
	System.out.println("Enter age for Validation :");
	int i = sc.nextInt();
	System.out.println(i + " isChild:"+val(i));
	
	}

}
