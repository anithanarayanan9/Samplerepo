package aggregation;

public class Aggregation2 {
	String authorname;
	int bookprice;
	Aggregation1 ref;
	public Aggregation2(String authorname,int bookprice,Aggregation1 ref)
	{
		this.authorname=authorname;
		this.bookprice=bookprice;
		this.ref=ref;
		
		
	}
	public void display()
	{
		System.out.println(ref.bookname +" " +ref.bookid);
		System.out.println(authorname  +bookprice    );
	}

	public static void main(String[] args) {
		
		Aggregation1 obj =new Aggregation1("Anitha",1);
		Aggregation2 obj1 =new Aggregation2("Sunitha ",20,obj);
		obj1.display();
		
	}

}
