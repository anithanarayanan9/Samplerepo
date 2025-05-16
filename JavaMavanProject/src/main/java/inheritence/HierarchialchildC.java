package inheritence;

public class HierarchialchildC extends HierarchialparentA {
	public void display3()
	{
		 System.out.println("Child Class C");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchialchildC obj = new HierarchialchildC();
		obj.display1();
		obj.display3();
	}

}
