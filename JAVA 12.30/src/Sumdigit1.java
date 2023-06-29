import java.util.Scanner;
//Define a method to return a product(multiply) of digit.
public class Sumdigit1 {
	static int sumOfDigit(int n)
	{
		int sum=1;
		while(n>0)
		{
			int r=n%10;
			sum=sum*r;
			n=n/10;
		}
		
		return sum;
	}
	    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n= sc.nextInt();
		int s1 = sumOfDigit(n);
		System.out.println("sum of product of Digit  is: "+n+" is "+s1);
	}

}
