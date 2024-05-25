package rgularExpStrings;

public class REwithString {

	public static void main(String[] args) 
	{
	String s1 = "Programmer45@gmail.com"  , s="a", s2="Pr";
	

	System.out.println(s.matches("."));
	System.out.println(s.matches("[abc]"));
	System.out.println(s.matches("[^123]"));
	System.out.println(s1.matches("[a-zA-Z0-9]*"));
	System.out.println(s2.matches("[P][r]"));
	System.out.println(s.matches("a|b"));
	System.out.println(s2.matches("Pr"));
	
	
	String s3="abc" , s4="abc123", s5="a b" ,s6="123";
	System.out.println("digs "+s6.matches("\\d"));
	System.out.println("no digs "+s5.matches("\\D"));
	
	
	}

}
