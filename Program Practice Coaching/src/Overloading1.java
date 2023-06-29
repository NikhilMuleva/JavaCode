
// Static Method Overloading 
public class Overloading1 {
	static void login(String email,String pwd)
	{
		System.out.println("Login via Email");
	}
	static void login(long phno,String pwd)
	{
		System.out.println("Login via Phone Number");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		login("rahul@123","java123");
		login(992681668, "java123");
		
		

	}

}
