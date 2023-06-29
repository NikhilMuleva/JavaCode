import java.util.Scanner;

public class NaturalNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;

		
		}
		System.out.println("sum of first Natural number: "+sum);

	}

}
