package rgularExpStrings;

public class Re3 {

	public static void main(String[] args)
	{
		//Remove spcl char 
		String s1 = "a1!g@7#jk%k&g(n";
		System.out.println("before remove spcl chrs"+s1);
		s1=s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("after replace :"+s1);
		
		
		
		//remove xtr space 
		String s2 = "  ab  cd    efg xy z  ";
		System.out.println(s2.replaceAll("\\S+"," ").trim());
		System.out.println(s2);
		
		
	}

}
