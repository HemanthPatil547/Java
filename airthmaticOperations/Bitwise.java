package airthmaticOperations;

public class Bitwise {

	public static void main(String[] args) 
	{
	int x=10 , y=6;
	int a = x&y;
	System.out.println("and :" + a);
	int b = x|y;
	System.out.println(" OR :"+b);
	int c = ~x;
	System.out.println("NOT a :"+c);
	int z=x>>1;
	int d =x<<1;
	long u=x>>>1;
	System.out.println("left shift :"+Integer.toBinaryString(d));
	System.out.println("rght shift :"+Integer.toBinaryString(z));
	System.out.println("left shift :"+u);
	}

}
