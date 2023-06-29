package loop;
class UderAgeException extends Exception
{
	UderAgeException()
	{
		super("you are under age");
	}
	UderAgeException(String message)
	{
		super(message);
	}
}
public class Voting {

	public static void main(String[] args) {
		int age=18;
		try
		{
			if(age<18)
			{
				throw new UderAgeException();
				
			}
			else
			{
				System.out.println("you can vote now....");
			}
		}
		catch(UderAgeException e)
		{
			e.printStackTrace();
		}
		System.out.println("hello nikhil");
		      

	}

}
