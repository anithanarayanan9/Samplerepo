package exceptionhandling;

public class ThrowsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int age=1;
	if(age>=18)
	{
		System.out.println("the candidate is eligible to vote");
	}
	else
	{
		throw new ArithmeticException("Age below 18");
	}
		
	}

}
