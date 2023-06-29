import java.util.Scanner;
public class PositiveNegativeNumber {

	public static void main(String[] args) {
		System.out.println("enter the number");
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		double num = s.nextDouble();
		
		if(num>=0)
		{
			System.out.println("This is positive number");
		}
		else
		{
		  System.out.println("This is negative Number");
			
		}

	}

}
