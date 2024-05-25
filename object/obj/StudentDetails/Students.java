package obj.StudentDetails;

public class Students 
{
	public int roll;
	public String Name,Course;
	public int m1,m2,m3;
	public int total()
	{
	
		return m1+m2+m3;
		
	}
	public float avg()
	{
		
			return total()/3;
		
		
	}
	public char grade()
	{
		if(m1<35 || m2<35 || m3<35)
		{
			return 'F';
		}
	else if(avg()>70)
		{
			return 'A';
		}
		else if(avg()>=55&&avg()<=70)
		{
			return 'B';
		}
		else if(avg()>=35 && avg()<55)
		{
			return 'C';
		}
		return 'F';
		
	}
	public String details()
	{
		return "Roll no :"+roll+"\nName :"+Name+"\nCourse :"+Course ;
		
	}

}
