package abstraction;

public class Abstractionchild  extends Abstractionparent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstractionchild  obj =new Abstractionchild ();
		obj.display();
		obj.show();
		obj.rendom();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("abstract");
	}
	public void rendom()
	{
		System.out.println("welcome");
	}

}
