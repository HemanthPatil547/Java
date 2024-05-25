package obj.maxNo;

public class Maxx {

	public static void main(String[] args) 
	{
	System.out.println("Maxx No is :");
	Maxx m = new Maxx();
	System.out.println(m.average(1.2, 1.2, 3.3));
	//m.max(34, 43);
	}

	int max(int a, int b)
	{
		return b;
		
	}
	public double average(double d,double e,double f)
	{
		double avg = (d+e+f)/3;
		
		return  avg; 
	}
	
}
