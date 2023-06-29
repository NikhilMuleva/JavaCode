import java.util.Scanner;
public class ReverseDigit {
	static int reverseDigit(int n)
	{
		int rev=0;
		while(n!=0)
		{
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		return rev;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n= sc.nextInt();
		int s1= reverseDigit(n);
		System.out.println("Reverse digit of number is "+n+ " is "+s1);

	}

}
