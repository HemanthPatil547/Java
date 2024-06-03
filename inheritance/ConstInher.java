package inheritance;

public class ConstInher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Child1 c1=new Child1(10,20);
		Child1 c2=new Child1(10);
		

	}

}


class Parent1
{
    Parent1()
    {
        System.out.println("Non-Parameter of parent");
    }
    Parent1(int x)
    {
        System.out.println("Parameter of parent "+x);
    }
}

class Child1 extends Parent1
{
    Child1()
    {
        System.out.println("Non-Parameter of child");
    }
    Child1(int y)
    {
        System.out.println("Parameter of child "+y);
    }
    Child1(int x,int y)
    {
        super(x);
        System.out.println("2nd parameter of child "+y);
    }
}
