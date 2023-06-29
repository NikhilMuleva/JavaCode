import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		System.out.println("enter the number");
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num =s.nextInt();
		 
		if(num%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("odd number");
		}
		

	}

}
