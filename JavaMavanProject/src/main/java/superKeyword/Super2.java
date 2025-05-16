package superKeyword;

public class Super2 extends Super1 {
	
	String name="Anil";
	public void display()
	{
		System.out.println(name);
		System.out.println(super.name);
	}

	public static void main(String[] args) {
		
      Super2 obj =new Super2();
      obj.display();
	}

}
