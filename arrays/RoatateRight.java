package arrays;

public class RoatateRight {

	public static void main(String[] args) 
	{
		int B[] = {1,2,3,4,78,6,7,8,9,10,11,12};
		System.out.println("Length of Array B is :"+B.length);
		
		for (int x : B)
		{
			System.out.print(x + ",");
		
		}
		System.out.println();
		System.out.println("Rotate left one place");
		
		int temp = B[B.length-1];
		for(int i = B.length-1 ;i>0;i--) 
		{
			B[i]=B[i-1];
		}
		B[0]=temp;
		
		for (int x : B)
		{
			System.out.print(x + ",");
			
		}
		

	}

}
