package inheritence;

public class Cchild extends Bparentchild{
	public void display3()
	{
		 System.out.println("Child Class of B");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cchild obj=new Cchild();
		obj.display1();
		obj.display2();
		obj.display3();

	}

}
