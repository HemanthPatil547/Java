package ovrlding;

import java.util.Scanner;

public class RevArrNo 
{
	
	public static int[] rev(int A[]) 
	{
		int B[] = new int [A.length];
		for(int i=0,j=A.length-1;i<A.length;i++,j--)
		{
			B[j]=A[i];
		}
		return B;
		/*for(int i=0;i<B.length;i++)
		{
			System.out.print(B[i]);
			if(i<B.length-1)
			{
				System.out.println(",");
			}
		}*/
		
		
		
	}
	
	public static int rev(int a)
	{
		int temp = a;
		int x =0; 
		while(temp!=0)
		{
			
			x = x*10+(temp%10);
			temp = temp/10;
			
		}
		return x;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int A[] = {1,2,3,4,5,6,7,8,9};
		int B[]=rev(A);
		System.out.println("Array B is Reversed from method \n The Array B Elements Are :");
		for(int i=0;i<B.length;i++)
		{
			System.out.print(B[i]);
			if(i<B.length-1)
			{
				System.out.print(",");
			}
		}
		
		System.out.println("\n\nEnter A No for reversing");
		int x= sc.nextInt();
		System.out.println(x + " is Reversed  : "+ rev(x));
		
	}

}
