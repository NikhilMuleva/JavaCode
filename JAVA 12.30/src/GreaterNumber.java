import java.util.Scanner;

public class GreaterNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number: ");
		int a= sc.nextInt();
		System.out.println("enter the second number: ");
		int b=sc.nextInt();
		
		if(a>b)
			System.out.println(a+" a is Greater Number");
		else 
			System.out.println(b+" b is Greater Number");
		
		//Using Condtional Operator
		int big=(a>b)?a:b;
		System.out.println("biggest is: " + big);
		
	}

}
