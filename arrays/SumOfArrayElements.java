package arrays;

public class SumOfArrayElements {

	public static void main(String[] args) 
	{
	
		int B[] = {1,2,3,4,5,6,7,8,9,10,11,12};
		System.out.println("Length of Array B is :"+B.length);
		int sum = 0 , EESum = 0 ,OESum = 0; //EEsum = Even elements OEsum = odd elements
		
		for(int i =0 ; i<B.length;i++)
		{
			sum = sum + B[i];
		}
		System.out.println("SUM of all elements is :"+sum);
		
		// sum of even and odd elements seperately
		for(int i =0 ; i<B.length;i++)
		{
	
			if(B[i]%2==0)
			{
				EESum =EESum + B[i]; 
			}
			else
			{
				OESum = OESum + B[i];
			}
		}
		System.out.println("Sum of Even Elements is :"+EESum);
		System.out.println("Sum of Odd Elements is :"+OESum);
		
		
		//sum of even index and odd index sepertly
		int EIS = 0,OIS = 0;
		for(int i =0 ; i<B.length;i++)
		{
	
			if(i%2==0)
			{
				EIS =EIS + B[i]; 
			}
			else
			{
				OIS = OIS + B[i];
			}
		}
		System.out.println("Sum of Even Index is :"+EIS);
		System.out.println("Sum of Odd Index is :"+OIS);

	}

}
