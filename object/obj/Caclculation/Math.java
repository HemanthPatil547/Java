package obj.Caclculation;

public class Math 
{
	public void sum(int a, int b)
	{
		int s = a+b;
		
		System.out.println("The sum of 2 No's is : = "  + s );
		
	}
	
	public void sub(int a,int b)
	{
		int sub1 = a-b;
		int sub2 = b-a;
		
		System.out.println("substraction of B from A is ::= " + sub1);
		System.out.println("substraction of A from B is ::= " + sub2);
		
	}
	public void mul(int a,int b)
	{
		long m = a * b;
		
		System.out.println("Multiplication of 2 No's is ::= " + m);
		
	}
	public void div(float a,float b)
	{
		float d1 = a/b;
		float d2 = b/a;
		
		System.out.println("Div of A by B is ::="   + d1);
		
		System.out.println("Div of B by A is ::="   + d2);
	}
}
