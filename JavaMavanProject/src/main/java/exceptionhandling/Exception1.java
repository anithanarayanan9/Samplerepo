package exceptionhandling;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		try {
		int c=a/b;
		System.out.println(c);
		}
//		catch(ArithmeticException d)
//		{
//		   b=10;
//		   int c=a/b;
//		   System.out.println(c);
//		   System.out.println(d);
//		}
		finally {
			
			System.out.println("Exception completed");
		}
		
		}
	}


