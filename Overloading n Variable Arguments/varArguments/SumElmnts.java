package varArguments;

public class SumElmnts {
	
	static int sum(int...A) {
		if(A.length==0)
		{
			return 0;
		}
		int sum = 0;
		for (int i =0;i<A.length;i++ )
		{
			sum = sum + A[i];
		}
		return sum;
	}
	

	public static void main(String[] args)
	{
		int A[] = {1,2,3,4,5,6,7,55,43,66,88,99};
		int sum1 = sum(A);
		int sum2 = sum();
		int sum3 = sum(10,99);
		System.out.println(sum1);
		System.out.println("Emty Method :"+ sum2);
		System.out.println("enter with Nos :"+sum3);
		
	}

}
