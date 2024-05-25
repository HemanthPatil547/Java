package obj.maxNo;

public class Max {

	public static void main(String[] args) 
	{
	
		Max t = new Max();
		System.out.println(t.maxx(10, 20));
		
		int m1 = t.maxx(10,20,30);
		System.out.println(m1);
	}
	public int maxx(int a, int b)
	{
		if(a>b)
		{
			return a;
		}
		return b;	
	}
	public int maxx(int a,int b,int c)
	{
		if(a>b && a>c)
		{
			return a;
		}
		else if (b>c)
		{
			return b;
		}
		return c;
	}
	
	
	
}
