package NumberPattern;
//
//    1
//   121
//  12321
// 1234321
//123454321
//
//    1
//   121
//  12321
// 1234321
//123454321
//
//    1
//   212
//  32123
// 4321234
//543212345
//


import java.util.Scanner;

public class Num6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+"");
			}
			for(int l=i-1;l>=1;l--)
			{
				System.out.print(l+"");
			}
			
			System.out.println();
		}
		System.out.println();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			int k=1;
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(k+"");
				if(j<i)
					k++;
				else
					k--;
			}
			System.out.println();
		}
		
		
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			int k=i;
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(k+"");
				if(j<i)
					k--;
				else
					k++;
			}
			System.out.println();
		}
	
		
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>i;j--)
			{
				System.out.print(j+"");
			}
			for(int j=2;j<=1;j++)
			{
				System.out.print(j+"");
			}
		}
		
	}

}
