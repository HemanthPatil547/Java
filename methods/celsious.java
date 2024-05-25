package methods;

public class celsious {
	public static float f2(float f1)
	{
		float s = (f1 - 32) * 5 /9 ;
		
		
		return s;
	}

	public static void main(String[] args) 
	{
		
		float f =  f2(89);

		System.out.println(" converted celsious is  :" +f);
		
	}

}
