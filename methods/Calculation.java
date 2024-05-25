package methods;

public class Calculation {
	
	public static void sum(int a, int b)
	{
		int s = a+b;
		
		System.out.println("The sum of 2 No's "+a+"and " +b+ "is : = "  + s );
		
	}
	
	public static void sub(int a,int b)
	{
		int sub1 = a-b;
		int sub2 = b-a;
		
		System.out.println("substraction of B from A   "+a+" and " +b+ "is ::= " + sub1);
		System.out.println("substraction of A from B is ::= " + sub2);
		
	}
	public static  void mul(int a,int b)
	{
		long m = a * b;
		
		System.out.println("Multiplication of 2 No's  "+a+"and " +b+ " is ::= " + m);
		
	}
	public static void div(float a,float b)
	{
		float d1 = a/b;
		float d2 = b/a;
		
		System.out.println("Div of A by B  "+a+" and  " +b+ " is ::="   + d1);
		
		System.out.println("Div of B by A is ::="   + d2);
	}


	public static void main(String[] args)
	{
	
		
		sum(25, 67);
		sub(35, 54);
		mul(9855234, 756732);
		div(36, 54);
	}

}
