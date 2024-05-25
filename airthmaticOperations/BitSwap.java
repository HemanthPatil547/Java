package airthmaticOperations;

public class BitSwap {

	public static void main(String[] args) 
	{
		int a=9,b=12;
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("A="+a);
		System.out.println("B ="+b);
	}

}
