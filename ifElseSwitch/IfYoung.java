package ifElseSwitch;

import java.util.Scanner;


public class IfYoung {

	public static void main(String[] args) 
	{
	
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter age of Person :");
		int age = sc.nextInt();
		
		if(age >100 && age<=0) {
			System.out.println("Enter valid age : age must be between 0 and 100");
		}
		else if(age <= 60 && age >=14) {
			System.out.println("young");
			
		}
		else if(age > 60)
		{
			System.out.println("Person is Senior ");
			
		}
		
		else   {
			System.out.println("Child");
			
		}
		
		
	}

}
