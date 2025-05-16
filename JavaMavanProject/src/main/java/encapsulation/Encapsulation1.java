package encapsulation;

public class Encapsulation1 {
	private int age;
	private String name;
	

	public void setdata(String name,int age)
	{
		this.name=name;
		this.age=age;
		
	}
	
	public void getdata()
	{
		System.out.println(name +age);
	}
	
	}

