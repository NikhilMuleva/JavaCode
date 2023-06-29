import java.util.Scanner;
public class FactorialRecursion {
	static int fact =1;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter number");
		int no = s.nextInt();
		FactorialRecursion ob = new FactorialRecursion();
		ob.callfact(no);
		System.out.println("Factorial of : " +no+ "is" +fact);
		// TODO Auto-generated method stub

	}
	void callfact(int no)
	{
		if(no>=1)
		{
			fact=fact*no;
			callfact(no-1);
		}
	}
	

}
