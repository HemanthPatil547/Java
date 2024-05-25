package arrays;

public class MaxElmnt {

	public static void main(String[] args) 
	{
		int B[] = {1,2,3,4,78,6,7,8,9,10,11,12};
		System.out.println("Length of Array B is :"+B.length);
		
		int max = B[0];

		for(int i = 0 ;i<B.length;i++) 
		{
			if ( max < B[i])
			{
				max = B[i];
			}
		}
		
		System.out.println("Maximum Element is : "+max);
	}

}
