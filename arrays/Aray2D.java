package arrays;

public class Aray2D {

	public static void main(String[] args)
	{
		int A[][] = new int [3][4];
		int B[][]= {{1,2,3},{3,4,5},{5,6,7}};
		
		System.out.println("Array A Elements are :");
		for(int i=0;i<A.length;i++)
		{
			for(int j = 0;j<A[0].length;j++)
			{
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Array B Elements are :");

		for(int i=0;i<B.length;i++)
		{
			for(int j = 0;j<B[i].length;j++)
			{
				System.out.print(B[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("print B element using for each loop");
		
		for(int x[]:B)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		
	}

}
