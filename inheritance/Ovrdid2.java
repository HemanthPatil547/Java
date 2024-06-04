package inheritance;

public class Ovrdid2 {

	public static void main(String[] args) {
		
        Super1 sup=new Sub1();
        
        sup.meth1();
        sup.meth2();
        System.out.println();
        
        Super1 s =new  Super1();
        s.meth1();
        s.meth2();
        System.out.println();
        
        Sub1 s2 = new Sub1();
       // s2.meth1();
        s2.meth2();
        s2.meth3();
	}

}


class Super1
{
    public void meth1()
    {
        System.out.println("Super Meth1");
    }
    
    public void meth2()
    {
        System.out.println("Super Meth2");
    }
}

class Sub1 extends Super1
{
 
    public void meth2()
    {
        System.out.println("Sub Meth2");
    }
    
    public void meth3()
    {
        System.out.println("Sub Meth3");
    }
}

