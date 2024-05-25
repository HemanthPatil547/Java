package airthmaticOperations;

public class IncDec {

	public static void main(String[] args) 
	{
		int x = 5;
		++x;
		System.out.println("x :"+x);
		int y=++x;
		System.out.println("y :"+y);
		int z = x++;
		System.out.println("x :"+x);
		System.out.println("z :"+z);
		
		int a=5 , b= 4 , c,d;
		c=2*a+++3*++b;
		a--;b--;
		d=2*++a+3*b++;
		System.out.println("c :"+c);
		System.out.println("d :"+d);
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		
	}

}
