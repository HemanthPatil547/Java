package varArguments;

public class Test 
{
	static void show(int x , String...s)
	{
		for (int i=0;i<s.length;i++)
		{
			System.out.println(x+"."+s[i]);
			x++;
		}
	}

	public static void main(String[] args)
	{
	show(10,"arjun","abhi","Bhavya","Bhagya","Charan");
		
	}

}
