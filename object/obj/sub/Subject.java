package obj.sub ;

public class Subject 
{
	public float avg (float math,float chem,float phy)
	{
		float f = (math+chem+phy)/3;
		
		return f;

		
	}

	
	
	
	public float per (float math,float chem,float phy)
	{
		float f = ((math+chem+phy)/300)*100;
		//or
		//float a =(math+chem+phy);
		//float f = (a/300)*100;
		
		
		return f;

		
	}
}
