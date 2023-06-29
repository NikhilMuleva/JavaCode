import java.util.Scanner;
public class SumOfEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=s.nextInt();
		
		if(n%2==0) {
			for(int i=0;i<=n;i=i+2)
			{
				sum=sum+i;
			}
			System.out.println("Sum of even"+sum);
		}
		else
		{
			for(int i=1;i<=n;i=i+2)
			{
				sum=sum+i;
			}
			System.out.println("Sum of Odd:  "+sum);
		}

	}

}
