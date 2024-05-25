package rgularExpStrings;

public class StringMeth {

	public static void main(String[] args) 
	{
	
		String s1 = "  Wel Come  ",s2,s3,s4,s5,s6,s7,a1,a2,a3,a4;
		boolean s9;
		boolean s8;
		System.out.println("Length of s :"+s1.length());
		
		s2=s1.toLowerCase();
		System.out.println("s2 low case :"+s2);
		
		s3=s1.toUpperCase();
		System.out.println("s3 up cse :"+s3);
		
		s4=s3.trim();
		System.out.println("s4 trim :"+s4);
		
		s5=s3.substring(3);
		s6=s3.substring(3, 8);
		System.out.println("subString strt :"+s5+"substring strt n end :"+s6);
		
		s7= s3.replace("E","e");
		System.out.println("replace E n e :"+s7);
		
		s8= s3.startsWith("  W");
		s9 =s3.endsWith(" e");
		System.out.println("strts with Wel :: "+s8+" \n ends with e  : "+s9);
		
		System.out.println("char at index 6 in s3 :"+s3.charAt(6));
		
		System.out.println("index no of W :"+s1.indexOf("We"));
		
		System.out.println("index no e starting 5th index :"+s1.indexOf('e', 5));
		
		System.out.println("last index :"+s1.lastIndexOf('w'));
		
		a1="Java";
		a2="java";
		a3="java";
		a4="python";
		
		System.out.println(a1.equals(a2));
		System.out.println(a2.equals(a3));
		
		System.out.println(a1.equalsIgnoreCase(a2));
		System.out.println(a1.equalsIgnoreCase(a4));
		
		
		
	}

}
