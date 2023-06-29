package Matrix;
//Sum of the Maximum element in the row from the Matrix

import java.util.Scanner;

public class SumMaxRow {

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
		
		 System.out.println("sum of the Each row: ");
		for(int i=0;i<a.length;i++)
		{ 
			int sum=0;
			for(int j=0;j<a[i].length;j++)
			{
				sum=sum+a[i][j];
	     	}
			System.out.println("At row: "+ (i+1)+" sum of : "+sum);
		}	
		
		
	}
	
}


