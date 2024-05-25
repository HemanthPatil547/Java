package methods;

public class Triangle {
	
	static float area(float b,float h)
	{
		float s = (0.5f) *(b * h);
		
		return s;
		
	}


	public static void main(String[] args) {
	
		float f = area(3, 9);
		
		System.out.println(f);

	}

}
