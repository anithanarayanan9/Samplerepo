package inheritence;

public class HierarchialchildB extends HierarchialparentA {
	public void display2()
	{
		 System.out.println("Child Class B");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchialchildB obj = new HierarchialchildB();
	    obj.display1();
		obj.display2();
	}

}
