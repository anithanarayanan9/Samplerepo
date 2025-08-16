package exceptionhandling;

public class Exception3 {

	public static void main(String[] args) throws VotingException {
		// TODO Auto-generated method stub

	int age=7;
	if(age>=18)
	{
		System.out.println("Eligible for voting");
	}
	else
	{
		throw new VotingException("Age below 18");
	}

}
}
