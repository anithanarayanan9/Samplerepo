package methodOverriding;

public class Childclass extends Parentclass {
	
	   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childclass obj=new Childclass();
		obj.add(4,10);
	}
	public void add(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
				super.add(10,20);
	}

}
