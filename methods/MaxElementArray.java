package methods;

public class MaxElementArray {

	public static void main(String[] args)
	{
	
		int A[] = {1,2,3,45,6,7,8,9,5,4,3,55,78,99,3};
		System.out.println("Big Element in Array is  :"+max(A));
	}

	 static int max(int[] a) 
	 {
		 int max = a[0];
		 for(int i = 0 ; i<a.length;i++)
		 {
			 if (max<a[i])
			 {
				 max = a[i];
			 }
		 }
		return max;
	}

}
