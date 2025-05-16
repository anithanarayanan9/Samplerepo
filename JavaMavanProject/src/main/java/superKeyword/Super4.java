package superKeyword;

public class Super4 extends Super3
{
	
	public void display2()
	{
		System.out.println("hello world");
		super.display();
	}
	public static void main(String args[])
	{
		Super4 obj =new Super4();
		obj.display2();
	}

}
