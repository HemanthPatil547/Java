package arrays;

public class SecMax {

	public static void main(String[] args) 
	{
		int B[] = {1,2,3,4,78,6,7,8,9,10,11,12};
		System.out.println("Length of Array B is :"+B.length);
		
		int max1,max2;
		max1 = max2 = B[0];

		for(int i = 0 ;i<B.length;i++) 
		{
			if ( max2 < B[i])
			{
				max1 = max2;
				max2 = B[i];
			}
			else if (max1 < B[i])
			{
				max1=B[i];
			}
		}
		
		System.out.println("Maximum Element is : "+max2);

		System.out.println("Second Maximum Element is : "+max1);

	}

}
