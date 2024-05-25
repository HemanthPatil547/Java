package arrays;

public class InsertElmnt {

	public static void main(String[] args) 
	{
		int A [] = new int [10];
		A[0]=3;A[1]=5;A[2]=4;A[3]=9;A[4]=8;A[5]=6;
		
		int n = 6;
		for(int i = 0 ; i<n;i++)
		{
			System.out.print(A[i]);
			if(i<n-1)
			{
				System.out.print(",");
			}
		}
		System.out.println();
		
		int x = 20 ,index=3;
		
		for(int i = n ; i>index;i--)
		{
			A[i]=A[i-1];
			
		}
		A[index] = x;
		
		for(int i = 0 ; i<n+1;i++)
		{
			System.out.print(A[i]);
			if(i<n)
			{
				System.out.print(",");
			}
		}
		
		
	}

}
