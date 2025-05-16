package methodOverriding;

public class Subc extends Subtractp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subc obj=new Subc();
		obj.sub();
		

	}
	public void sub()
	{
		float a=22.90f;
		float b=18.8f;
		float diff=a-b;
	System.out.println(diff);
	super.sub();
			
	}
}
