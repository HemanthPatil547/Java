package arrays;

public class CpyArry {

	public static void main(String[] args) 
	{
	int A [] = {2,3,1,4,5,6,7,8,9,6,5,4,3};
	int l = A.length;
	int B[] = new int [l];
	
	System.out.println("Array A elements Are : ");
	for(int i = 0 ; i<l;i++)
	{
		System.out.print(A[i]);
		if(i<l-1)
		{
			System.out.print(",");
		}
	}
	
	for(int i = 0 ; i<l;i++)
	{
		B[i] =A[i];
	}
	
	System.out.println();
	System.out.println("Array B Elements are :");
	for(int i = 0 ; i<l;i++)
	{
		System.out.print(B[i]);
		if(i<l-1)
		{
			System.out.print(",");
		}
	}
	
	
	}

}
