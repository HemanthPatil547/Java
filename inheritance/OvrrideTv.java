package inheritance;

public class OvrrideTv {

	public static void main(String[] args) 
	{
		   TV t=new SmartTV();
	        
	        t.switchON();
	        t.changeChannel();
	        
	        SmartTV st = new SmartTV();
	      st.browse();
	      
	      
	      TV t2= new TV();
	      t2.changeChannel();
	      t2.switchON();
	}

}




class TV
{
    public void switchON()
    {
    	System.out.println("TV is Switched ON");
    }
    
    public void changeChannel() 
    {
    	System.out.println("TV Channel is Changed ");
    }
    
}

class SmartTV extends TV
{
   
    public void switchON()
    {
    	System.out.println("Smart TV is Switched ON"); 
    }
    
   
    public void changeChannel() 
    {
    	System.out.println("SmartTV Channel is Changed "); 
    }
    
    public void browse()
    {
    	System.out.println("Smart Tv Browsing");
    }
    
}





