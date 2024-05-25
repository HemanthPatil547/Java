package arrays;

public class CreateArray {

	public static void main(String[] args)
	{
	
	int A[] = new int [10];
	System.out.println(A.length); //10
	
	int B[] = {1,2,3,4,5,6,7,8,9};
	for(int i =0 ; i<B.length;i++)
	{
		System.out.print(B[i]);
		if(i<(B.length-1))
		{
			System.out.print(",");
		}
	}
	System.out.println();
	B[2]=15;
	for(int i =0 ; i<B.length;i++)
		{
		System.out.println(B[i]++ );
	}
	
	for(int x:B)
	{
		System.out.print(x + ",");
	}
	
	int c [];
	c= new int [5];
	
		int [] D = new int [7];
		
	}

}
