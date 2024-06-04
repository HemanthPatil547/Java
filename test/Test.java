package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Ent a Word");
		String Word1 = sc.nextLine();
		System.out.println("Ent a Index");
		int index= sc.nextInt();
		System.out.println(Word1.charAt(index));
		
		
	}

}

//Input: str = "Geeks", index = 2 Output: e 
//Input: str = "GeeksForGeeks", index = 5 Output: F