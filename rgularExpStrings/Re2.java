package rgularExpStrings;

public class Re2 {

	public static void main(String[] args) 
	{
	// no is binary
	
	int b = 100100011;
	String s1= String.valueOf(b);
	System.out.println("The No is Binary or not   :"+b);
	System.out.println(s1.matches("[01]+"));
	
	//hexadec or not 
	
	String h = "1234F";
	System.out.println("The No is Hexa or Not  :"+ h);
	System.out.println(h.matches("[0-9A-F]+"));
	
	
	//date 
	String d = "12/03/2000";
	System.out.println("date format  :"+d.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));	
		
	}

}
