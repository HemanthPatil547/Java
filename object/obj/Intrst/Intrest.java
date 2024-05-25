package obj.Intrst;

public class Intrest 
{
	public void Intrst(int p,float t,float r)
	{
		float I = (p* t * r)/100;
		float b = I + p ;
		
		
		System.out.println("Intrest is ::" + I);
		System.out.println("Total ammount is after  "  +  t  +  "  yrs :: " + b);
	}

}
