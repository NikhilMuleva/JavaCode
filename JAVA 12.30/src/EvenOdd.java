import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the Number : ");
		int n = sc.nextInt();
		
		if(n%2==0)
			System.out.println(n+" is Even number");
		else
			System.out.println(n+" is Odd number");
		
		//Using Condtional Operator
		String st=(n%2==0)? "even": "odd";
		System.out.println(n+" is "+ st);
		
	}

	

}
