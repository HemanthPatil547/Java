package arrays;

public class AddMatrix {

	public static void main(String[] args)
	{
		int B[][]= {{1,2,3},{3,4,5},{5,6,7}};
		int A[][]= {{1,2,3},{3,4,5},{5,6,7}};
		int c[][]=new int [3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j = 0;j<3;j++)
			{
				c[i][j]=A[i][j]+B[i][j];
			}
		}
		
		
		System.out.println("Array A Elements are :");

		for(int i=0;i<A.length;i++)
		{
			for(int j = 0;j<A[i].length;j++)
			{
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Array B Elements are :");

		for(int i=0;i<B.length;i++)
		{
			for(int j = 0;j<B[i].length;j++)
			{
				System.out.print(B[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Add A and B store in C is :");

		for(int i=0;i<c.length;i++)
		{
			for(int j = 0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}


		
	}

}
