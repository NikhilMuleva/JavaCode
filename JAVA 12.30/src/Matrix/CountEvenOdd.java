package Matrix;

import java.util.Scanner;

public class CountEvenOdd {

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
		int  even=0,odd=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]%2==0)
					even=even+a[i][j];
				else 
					odd=odd+a[i][j];    	
			}
		
		}
		System.out.println("Matrix count of Even "+even + "\n"+ "and  count of odd  "+ odd);


	}

}
