package obj.Rectangle;

public class RectAngle
{

	public double length,breadth;
	public double area()
	{
		return length*breadth;
			
	}
	public double perimeter()
	{
		return 2*(length+breadth);
		
	}
	public boolean isSqure()
	{
		if(length==breadth)
		{
			return true;
		}
		return false;
	}

}
