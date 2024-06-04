package inheritance;

public class Ovrride {

	public static void main(String[] args) 
	{

        Super s=new Sub();
        s.display();
        
        Super s2 = new Super();
        s2.display();
        
        Sub s3 = new Sub();
        s3.display();
	}
	

}


class Super
{
    public void display()
    {
        System.out.println("Super Display");
    }
}

class Sub extends Super
{
    public void display()
    {
        System.out.println("Sub Display");
    }
}
