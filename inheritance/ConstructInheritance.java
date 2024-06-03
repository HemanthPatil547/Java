package inheritance;

public class ConstructInheritance {

	public static void main(String[] args) {
		GrandChild c = new GrandChild();
		
	}
}

class Parent
{
    public Parent()
    {
        System.out.println("Parent Constrcutor");
        
    }
    public void parent()
    {
    	System.out.println("Parent Method");
    }
            
}

class Child extends Parent
{
    public Child()
    {
        System.out.println("Child Constructor");
        super.parent();
        this.child();
    }
    public void child()
    {
    	System.out.println("child Method");
    }
}

class GrandChild extends Child
{
    public GrandChild()
    {
        System.out.println("Grand Child Constructor");
    }
    public void Gchild()
    {
    	System.out.println("gchild Method");
    }
}
