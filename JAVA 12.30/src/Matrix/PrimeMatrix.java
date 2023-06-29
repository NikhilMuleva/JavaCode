package Matrix;

import java.util.Scanner;

public class PrimeMatrix {
	static boolean isPrime(int n)
	{
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the rows:");

		int r= sc.nextInt();
		System.out.println("enter the col:");

		int c=sc.nextInt();
		int a[][]=new int[r][c];
		System.out.println("Enter the "+r*c+"element: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();

		}

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				boolean rs=isPrime(a[i][j]);
				if(rs==true)
					System.out.println("prime");
				else
				    System.out.println("Not prime");
	     	}
		}	
	}
}
