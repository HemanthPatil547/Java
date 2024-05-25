package methods;

public class Average {

	public static void main(String[] args) 
	{
		float f = average(24,54.67f,43);
		
		System.out.println(f);	
	}

	public static float average(float n1,float n2,float n3)
	{
		float avg = (n1+n2+n3)/3;
		
		return avg; 
	}

}
