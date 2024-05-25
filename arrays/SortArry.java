package arrays;

import java.util.Arrays;

public class SortArry {

	public static void main(String[] args)
	{
	String[] s= {"java","python","j2ee"};
	int [] A = {1,5,7,9,9,7};
	Arrays.sort(A);
	Arrays.sort(s);
	
	for(int x:A)
	{
		System.out.print(x + ",");
	}
	System.out.println();
	for(String X:s)
	{
		System.out.print(X + ",");
	}
	
	}

}
