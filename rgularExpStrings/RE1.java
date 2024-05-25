package rgularExpStrings;

public class RE1 {

	public static void main(String[] args)
	{
	
		String s1="Programmer@gmail.com";
		System.out.println(s1.matches("\\W*@gmail(.*)"));
		
		
		System.out.println("email is on gmail");
		System.out.println(s1.matches(""));
		
		System.out.println("uname n dName");
		int i = s1.indexOf('@');
		//System.out.println(s1.substring(i));
		String Uname = s1.substring(0, i);
		String Dname = s1.substring(i+1, s1.length());
		
		System.out.println("UName :"+Uname);
		System.out.println("DName  :"+Dname);
		
		System.out.println("gmail is contain :"+Dname.startsWith("gmail"));
	}

}
