package Matrix;
//Find the Maximum element in the row from the Matrix

import java.util.Scanner;

public class MaxMatrix {

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
		
		int max=0; 
		for(int i=0;i<a.length;i++)
		{ 
			
			for(int j=0;j<a[i].length;j++)
			{
				if(max<a[i][j])
					max=a[i][j];
				
	     	}
			System.out.println("At the maximum Element in the: "+ max);

		}	
		
	}

}
