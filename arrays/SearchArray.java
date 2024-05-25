package arrays;

import java.util.Scanner;

public class SearchArray {

	public static void main(String[] args)
	{
		int B[] = {1,2,3,4,5,6,7,8,9,10,11,12};
		System.out.println("Length of Array B is :"+B.length);
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a search elemnt");
		int s = sc.nextInt();
		
		for ( int x : B)
		{
			if(x==s)
			{
				System.out.println(s + "  This element is Present");
				System.exit(0);
			}
			
		}
			
		// OR
		
		for(int i = 0 ;i<B.length;i++) 
		{
			if(B[i]==s)
			{
				System.out.println(s + "  This element is Present index No is : " + i );
				System.exit(0);
			}
		}
		System.out.println("Not Found");
		
		sc.close();
	}

}
