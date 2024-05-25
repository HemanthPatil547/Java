package varArguments;

public class MaxNo {
	static int max(int...A) {
		if(A.length==0)
		{
			return 0;
		}
		int m = A[0];
		for (int i =0;i<A.length;i++ )
		{
			if(m<A[i])
			{
				m=A[i];
			}
		}
		return m;
	}
	

	public static void main(String[] args) 
	{
	int A[] = {1,2,3,4,5,6,7,55,43,66,88,99};
	int maxx = max(A);
	int maxx2 = max();
	int maxx3 = max(10,99);
	System.out.println(maxx);
	System.out.println("Emty Method :"+ maxx2);
	System.out.println("enter with Nos :"+maxx3);
	}

}
