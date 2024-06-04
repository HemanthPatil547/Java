package inheritance;

public class OvrideCar {

	public static void main(String[] args) 
	{

        Car c=new LuxaryCar();
        c.start();
        c.accelerate();
        c.changeGear();
        //c.openRoof();
        
        LuxaryCar lc =  new LuxaryCar();
        lc.openRoof();
        System.out.println();
        System.out.println();
        
        Car c2 = new Car();
        c2.start();
        c2.accelerate();
        c2.changeGear();
	}

}


class Car
{
    public void start()
    {
    	System.out.println("Car Started");
    }
    public void accelerate()
    {
    	System.out.println("Car is Accelerated");
    }
    public void changeGear()
    {
    	System.out.println("Car Gear Changed");
    }
    
}

class LuxaryCar extends Car
{
    public void changeGear()
    {
    	System.out.println("LuxuryCar have Automatic Gear");
    }
    public void openRoof()
    {
    	System.out.println("LuxuryCar's Sun Roof is Opened");
    }
    
}


