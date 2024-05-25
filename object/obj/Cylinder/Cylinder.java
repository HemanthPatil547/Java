package obj.Cylinder;

public class Cylinder
{

	double radious,height;
	public double lidArea()
	{
		return Math.PI*radious*radious;
	}
	public double circum()
	{
		return 2*Math.PI*radious;
		
	}
	public double volume()
	{
		//pir^2h
		return lidArea()*height;
		
	}
	public double surface()
	{
		return 2*lidArea()+circum()*height;
		//2pr^2+2pirh
		
	}
}
