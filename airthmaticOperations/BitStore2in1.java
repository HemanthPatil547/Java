package airthmaticOperations;

public class BitStore2in1 {

	public static void main(String[] args) 
	{
	 byte a=5,b=9;
	 
	 byte c= (byte) (a<<4);
	 c=(byte) (c|b);
	 System.out.println((c&0b00001111));
	 System.out.println((c&0b11110000)>>4);
	}

}
